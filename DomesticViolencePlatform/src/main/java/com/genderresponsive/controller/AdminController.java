package com.genderresponsive.controller;

import com.genderresponsive.model.User;
import com.genderresponsive.model.Therapist;
import com.genderresponsive.service.UserService;
import com.genderresponsive.service.TherapistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/admins")
public class AdminController {

    @Autowired
    private UserService userService;

    @Autowired
    private TherapistService therapistService;

    // Get all users
    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    // Get all therapists
    @GetMapping("/therapists")
    public List<Therapist> getAllTherapists() {
        return therapistService.getAllTherapists();
    }

    // Get reports
    @GetMapping("/reports")
    public Map<String, Long> getReports() {
        Map<String, Long> reports = new HashMap<>();
        reports.put("totalUsers", userService.countUsers());
        reports.put("totalTherapists", therapistService.countTherapists());
        return reports;
    }
}
