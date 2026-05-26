package com.adarsh.controller;

import com.adarsh.model.Patient;
import com.adarsh.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/save")
    public String savePatient(Patient patient) {

        patientRepository.save(patient);

        return "redirect:/";
    }
}