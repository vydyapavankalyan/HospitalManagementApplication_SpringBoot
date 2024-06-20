package com.sathya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.Repository.PatientRepository;
import com.sathya.model.Patient;
@Service
public class PatientServiceImpl implements PatientService {
	
	
	@Autowired
	private PatientRepository patientRepo;

	@Override
	public Patient savePatient(Patient patient) {
		return patientRepo.save(patient);	
	}
	
	
	@Override
	public Patient updatePatient(Patient patient) {
		
		return patientRepo.save(patient);
	}

	
	
	
	@Override
	public List<Patient> findAll() {
		
		return patientRepo.findAll();
	}
	
	
	@Override
	public void deleteId(long id) {
		patientRepo.deleteById(id);;

	}


	@Override
	public Patient findById(long id) {
		
		return patientRepo.findById(id).get(); 
	}
	


	


}
