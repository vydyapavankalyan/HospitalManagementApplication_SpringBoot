package com.sathya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.sathya.model.Patient;
import com.sathya.service.PatientServiceImpl;


@Controller
public class PatientController {
	
	@Autowired
	public PatientServiceImpl patientservice;
	
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/PatientRegistration")
	public String usearForm() {
		return"patientFormpage";
	}
	
	@PostMapping("/register")
	public String savePatients( Patient patient) {
		
		patientservice.savePatient(patient);
		
		return"sucess";
	}
	
	
	@RequestMapping("/viewpatient")
	public String viewAllPatients(ModelMap model) {
		model.put("Patient", patientservice.findAll());
		return "viewpatientsForm";
	}
	
	@RequestMapping("/delete/{id}")
	 public String deleteUser(@PathVariable long id)
	 {
		patientservice.deleteId(id);
    	return "redirect:/viewpatient";
		 
	 }

	 @RequestMapping("/edit/{id}")
	public String editForm(@PathVariable long id,ModelMap model)
	{
		model.put("command",patientservice.findById(id));
		return "editpatient";
	}
	
	 @RequestMapping("/editandsave")
	public String editAndSaveUser(Patient patient,ModelMap model)
	{
	   patientservice.savePatient(patient);
		return "redirect:/viewpatient";
	}
	
	
	

}
