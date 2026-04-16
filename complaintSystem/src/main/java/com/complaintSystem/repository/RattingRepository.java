package com.complaintSystem.repository;

import com.complaintSystem.entity.Ratting;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RattingRepository extends JpaRepository<Ratting,Long> {

    Optional<Ratting> findByComplaintId(Long complaintId);

}
