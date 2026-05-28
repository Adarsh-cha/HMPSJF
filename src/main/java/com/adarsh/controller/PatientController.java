package com.adarsh.controller;

import com.adarsh.model.Patient;
import com.adarsh.repository.PatientRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PatientController {

    private final PatientRepository patientRepository;

    public PatientController(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @GetMapping("/")
    public String home(Model model) {

        model.addAttribute(
                "patients",
                patientRepository.findAll()
        );

        return "index";
    }

    @PostMapping("/save")
    public String savePatient(Patient patient) {

        patientRepository.save(patient);

        return "redirect:/";
    }
}