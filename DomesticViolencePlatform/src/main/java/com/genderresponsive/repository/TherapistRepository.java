package com.genderresponsive.repository;

import com.genderresponsive.model.Therapist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TherapistRepository extends JpaRepository<Therapist, Integer> {
    // Custom query to find therapist by email and password
    Therapist findByEmailAndPassword(String email, String password);
}
