package com.genderresponsive.service;

import com.genderresponsive.model.ContactMessage;
import com.genderresponsive.repository.ContactMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactMessageService {

    @Autowired
    private ContactMessageRepository contactMessageRepository;

    // Save a new message
    public ContactMessage saveMessage(ContactMessage message) {
        return contactMessageRepository.save(message);
    }

    // Retrieve all messages
    public List<ContactMessage> getAllMessages() {
        return contactMessageRepository.findAll();
    }
}
