package com.example.my_hospital.controller;

import com.example.my_hospital.domain.Address;
import com.example.my_hospital.domain.Patient;
import com.example.my_hospital.service.PatientService;
import jakarta.validation.Valid;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;

    @GetMapping
    public String createForm(){return "";}

    @PostMapping
    public String create(@Valid PatientForm form, BindingResult result){

//        if(result.hasErrors()){
//            return "patients/createPatientFrom";
//        }
        Address address = new Address(form.getCity(), form.getStreet(), form.getZipcode());

        Patient patient = new Patient();
        patient.setName(form.getName());
        patient.setAge(form.getAge());
        patient.setGender(form.getGender());

        patientService.join(patient);
        return ":/";
    }
}
