package com.example.my_hospital.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
public class Reserve {

    @Id @GeneratedValue
    @Column(name = "reserve_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    private Long time;

    @Enumerated(EnumType.STRING)
    private ReserveStatus status; //예약상태

    //==연관관계 편의 메서드==//

    public void setPatient(Patient patient){
        this.patient = patient;
        patient.getReserves().add(this);
    }

    public void setDoctor(Doctor doctor){
        this.doctor = doctor;
        doctor.getReserves().add(this);
    }


    //==생성 메서드==//
    public static Reserve createReserve(Patient patient, Doctor doctor, Long time){
        Reserve reserve = new Reserve();
        reserve.setPatient(patient);
        reserve.setDoctor(doctor);
        reserve.setTime(time);
        reserve.setStatus(ReserveStatus.RESERVE);
        return reserve;
    }


    //==비즈니스 로직==//
    public void cancel(){
        if(status == ReserveStatus.COMP){
            throw new IllegalStateException("이미 끝남.");
        }

        this.setStatus(ReserveStatus.CANCEL);
    }
}
