package com.example.my_hospital.domain;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Patient {

    @Id @GeneratedValue
    @Column(name = "patient_id")
    private Long id;

    private String name;

    private int age;

    private String gender;

}
