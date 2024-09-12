package com.example.my_hospital.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
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

    private List<Department> departments = new ArrayList<>();
}
