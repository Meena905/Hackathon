package com.genderresponsive.service;

import com.genderresponsive.model.User;
import com.genderresponsive.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Method to get all users
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    // Method to count all users
    public long countUsers() {
        return userRepository.count();
    }

    // Method to save a user (registration)
    public void saveUser(User user) {
        userRepository.save(user);
    }

    // Method to update a user
    public void updateUser(int id, User updatedUser) {
        User existingUser = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        existingUser.setName(updatedUser.getName());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPassword(updatedUser.getPassword());
        userRepository.save(existingUser);
    }

    // Method to delete a user
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    // Method to log in a user
    public User loginUser(String email, String password) {
        return userRepository.findByEmailAndPassword(email, password);
    }
}
