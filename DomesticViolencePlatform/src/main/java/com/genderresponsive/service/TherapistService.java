package com.genderresponsive.service;

import com.genderresponsive.model.Therapist;
import com.genderresponsive.repository.TherapistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TherapistService {

    @Autowired
    private TherapistRepository therapistRepository;

    // Register a new therapist
    public void registerTherapist(Therapist therapist) {
        therapistRepository.save(therapist);
    }

    // Login a therapist by email and password
    public Therapist loginTherapist(String email, String password) {
        return therapistRepository.findByEmailAndPassword(email, password);
    }
}
