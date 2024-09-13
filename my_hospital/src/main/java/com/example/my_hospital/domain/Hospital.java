package com.example.my_hospital.domain;

import jakarta.persistence.*;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Hospital {

    @Id @GeneratedValue
    @Column(name = "hospital_id")
    private Long id;
    private String name;

    @Embedded
    private Address address;


    private List<Department> departments = new ArrayList<>();
}
