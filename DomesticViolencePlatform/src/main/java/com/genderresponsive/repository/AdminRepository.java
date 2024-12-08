package com.genderresponsive.repository;

import com.genderresponsive.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Integer> {
    Admin findByEmail(String email);
}
