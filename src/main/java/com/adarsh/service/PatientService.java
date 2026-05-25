package com.adarsh.service;

import com.adarsh.model.Patient;
import com.adarsh.repository.PatientRepository;

import org.springframework.stereotype.Service;

@Service
public class PatientService {

    private final PatientRepository repository;

    public PatientService(PatientRepository repository) {
        this.repository = repository;
    }

    public void addPatient(Patient patient) {
        repository.save(patient);
    }
}