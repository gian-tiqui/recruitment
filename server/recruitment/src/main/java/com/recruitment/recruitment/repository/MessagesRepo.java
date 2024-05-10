package com.recruitment.recruitment.repository;

import com.recruitment.recruitment.entity.Messages;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepo extends JpaRepository<Messages, Long> {
}
