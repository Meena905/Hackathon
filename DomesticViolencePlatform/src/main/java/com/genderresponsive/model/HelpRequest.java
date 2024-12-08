package com.genderresponsive.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "help_requests")
@Data
public class HelpRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false, length = 1000)
    private String issueDescription;
}
