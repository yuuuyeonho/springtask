package com.example.my_hospital.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.LAZY;

@Entity
@Getter @Setter
public class Doctor {

    @Id @GeneratedValue
    @Column(name = "doctor_id")
    private Long id;

    private String name;

    private int career;

    @ManyToOne(fetch = LAZY, cascade =  CascadeType.ALL)
    @JoinColumn(name = "dapartment_id")
    private Department department;

    @OneToMany(mappedBy = "reserve")
    private List<Reserve> reserves = new ArrayList<>();


    //==생성 메서드==//
//    public void Doctor createDoctor(String name, int career, Department department, Reserve... reserves){
//        Doctor doctor = new Doctor();
//        doctor.setName(name);
//        doctor.setCareer(career);
//        doctor.setDepartment(department);
//        for(Reserve reserve : reserves){
//            reserve.
//        }
//    }
}
