package com.genderresponsive.controller;

import com.genderresponsive.model.ContactMessage;
import com.genderresponsive.service.ContactMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactMessageController {

    @Autowired
    private ContactMessageService contactMessageService;

    // Save a new contact message
    @PostMapping
    public String saveMessage(@RequestBody ContactMessage message) {
        contactMessageService.saveMessage(message);
        return "Message sent successfully!";
    }

    // Get all contact messages
    @GetMapping
    public List<ContactMessage> getAllMessages() {
        return contactMessageService.getAllMessages();
    }
}

