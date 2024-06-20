package com.sathya.service;

import java.util.List;

import com.sathya.model.Patient;

public interface PatientService {
	public Patient savePatient(Patient patient);
	public Patient updatePatient(Patient patient);
	public void deleteId(long id);
	public Patient findById(long id);
	public List<Patient> findAll();
	

}
