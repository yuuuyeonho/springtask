package com.example.my_hospital.repository;

import com.example.my_hospital.domain.Doctor;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DoctorRepository {

    private final EntityManager em;

    public void save (Doctor doctor) { em.persist(doctor); }

    public Doctor findOne(Long id) { return em.find(Doctor.class, id); }


}
