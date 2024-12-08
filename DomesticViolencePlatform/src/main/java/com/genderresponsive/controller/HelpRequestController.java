package com.genderresponsive.controller;

import com.genderresponsive.model.HelpRequest;
import com.genderresponsive.service.HelpRequestService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/help")
public class HelpRequestController {

    @Autowired
    private HelpRequestService helpRequestService;

    // Endpoint to submit a help request
    @PostMapping
    public String submitHelpRequest(@RequestBody HelpRequest request) {
        helpRequestService.saveHelpRequest(request);
        return "Help request submitted successfully!";
    }

    // Fetch all help requests
    @GetMapping
    public List<HelpRequest> getAllHelpRequests() {
        return helpRequestService.getAllHelpRequests();
    }
}
