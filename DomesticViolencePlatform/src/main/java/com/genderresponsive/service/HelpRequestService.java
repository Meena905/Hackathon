package com.genderresponsive.service;

import com.genderresponsive.model.HelpRequest;
import com.genderresponsive.repository.HelpRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HelpRequestService {

    @Autowired
    private HelpRequestRepository helpRequestRepository;

    public HelpRequest saveHelpRequest(HelpRequest request) {
        return helpRequestRepository.save(request);
    }

    public List<HelpRequest> getAllHelpRequests() {
        return helpRequestRepository.findAll();
    }
}
