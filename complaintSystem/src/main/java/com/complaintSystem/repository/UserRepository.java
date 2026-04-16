package com.complaintSystem.repository;

import com.complaintSystem.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
     Optional<User>findBymobileNumber(String mobileNumber);

}
