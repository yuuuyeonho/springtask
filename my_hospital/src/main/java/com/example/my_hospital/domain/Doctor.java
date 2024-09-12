package com.example.my_hospital.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Doctor {

    @Id @GeneratedValue
    @Column(name = "doctor_id")
    private Long id;
    private String name;

    private Hospital hospital;
    private Department department;

    private int yaers;

}
