package com.genderresponsive.repository;

import com.genderresponsive.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    // Custom query to find a user by email and password
    User findByEmailAndPassword(String email, String password);
}
