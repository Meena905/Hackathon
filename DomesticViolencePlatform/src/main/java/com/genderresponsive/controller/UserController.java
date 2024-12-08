package com.genderresponsive.controller;

import com.genderresponsive.model.User;
import com.genderresponsive.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    // Existing method: Register a new user
    @PostMapping("/register")
    public String registerUser(@RequestBody User user) {
        userService.saveUser(user);
        return "User registered successfully!";
    }

    // Existing method: Login user
    @PostMapping("/login")
    public String loginUser(@RequestBody User user) {
        User loggedInUser = userService.loginUser(user.getEmail(), user.getPassword());
        if (loggedInUser != null) {
            return "Login successful! Welcome, " + loggedInUser.getName();
        } else {
            return "Invalid email or password!";
        }
    }

    // New method: Get all users
    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Additional methods for future development can be added here
}
