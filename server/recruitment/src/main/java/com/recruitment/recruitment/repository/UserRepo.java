package com.recruitment.recruitment.repository;

import com.recruitment.recruitment.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
