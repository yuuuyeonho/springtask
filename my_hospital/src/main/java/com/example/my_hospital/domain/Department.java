package com.example.my_hospital.domain;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

public class Department {

    @Id @GeneratedValue
    @Column(name = "department_id")
    private Long id;

    private String name;

    private Long callNumber;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

    @OneToMany(mappedBy = "dapartment")
    private List<Doctor> doctors = new ArrayList<>();

}
