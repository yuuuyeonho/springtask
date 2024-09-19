package com.example.my_hospital.repository;

import com.example.my_hospital.domain.Reserve;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReserveRepository {

    private EntityManager em;

    public void save(Reserve reserve) {em.persist(reserve);}

    public Reserve findOne(Long id) {return em.find(Reserve.class, id);}
}
