package com.sathya.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {
	
	@GetMapping("/doctors")
	public String homedoctor() {
		return "doctorsFormpage";
	}
	
	@GetMapping("/healthcheckups")
	public String healthCheckup() {
		return "healthcheckFormpage";
	}
	
	@GetMapping("/Hospitals")
	public String HospitalsDetails() {
		return "HospitalsFormpage";
	}


	@GetMapping("/Ambulance")
	public String AmbulanceDetails() {
		return "AmbulanceFormpage";
	}

	@GetMapping("/Enquiry")
	public String EnquiryDetails() {
		return "nquiryFormpage";
	}


}
