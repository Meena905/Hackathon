package com.genderresponsive.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "therapists")
@Data
public class Therapist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String specialization;
}
