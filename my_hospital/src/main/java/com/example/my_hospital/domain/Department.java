package com.example.my_hospital.domain;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.ArrayList;
import java.util.List;

public class Department {

    @Id @GeneratedValue
    @Column(name = "department_id")
    private Long id;

    private String name;

    private Long callNumber;

    private Hospital hospital;

    private List<Doctor> doctors = new ArrayList<>();

}
