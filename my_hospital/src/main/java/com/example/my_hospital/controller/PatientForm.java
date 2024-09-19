package com.example.my_hospital.controller;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PatientForm {

    @NotEmpty(message = "성함은 필수로 기재해주세요.")
    private String name;

    private int age;

    private String gender;


    private String city;
    private String street;
    private String zipcode;
}
