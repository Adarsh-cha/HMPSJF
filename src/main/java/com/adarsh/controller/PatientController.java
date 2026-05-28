package com.adarsh.controller;

import com.adarsh.model.Patient;
import com.adarsh.repository.PatientRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @PostMapping
    public Patient savePatient(@RequestBody Patient patient) {

        return patientRepository.save(patient);
    }

    @GetMapping
    public List<Patient> getAllPatients() {

        return patientRepository.findAll();
    }
}