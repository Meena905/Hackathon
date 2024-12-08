package com.genderresponsive.repository;

import com.genderresponsive.model.ContactMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactMessageRepository extends JpaRepository<ContactMessage, Integer> {
}
