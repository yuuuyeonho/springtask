package com.example.my_hospital.controller;

import com.example.my_hospital.service.DoctorService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class DoctorController {

    private final DoctorService doctorService;

//    @GetMapping

//    @PostMapping
    public String create (@Valid DoctorForm doctorForm, BindingResult result)
}
