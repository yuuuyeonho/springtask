package com.example.my_hospital.service;

import com.example.my_hospital.domain.Patient;
import com.example.my_hospital.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PatientService {

    private final PatientRepository patientRepository;

    public void join(Patient patient){
        patientRepository.save(patient);
    }


}
