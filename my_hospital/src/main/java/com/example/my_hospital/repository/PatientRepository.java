package com.example.my_hospital.repository;

import com.example.my_hospital.domain.Patient;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientRepository {

    @PersistenceContext
    private EntityManager em;

    public void save(Patient patient){em.persist(patient);}

    public Patient findOne(Long id) { return em.find(Patient.class, id);}

    public List<Patient> findAll(){
        return em.createQuery("select m from Patient m", Patient.class)
                .getResultList();
    }

    public List<Patient> findByName(String name){
        return em.createQuery("select m from Patient m where m.name = :name", Patient.class)
                .setParameter("name", name)
                .getResultList();
    }
}
