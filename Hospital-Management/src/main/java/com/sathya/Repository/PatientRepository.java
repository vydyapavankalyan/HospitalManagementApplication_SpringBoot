package com.sathya.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sathya.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {



}
