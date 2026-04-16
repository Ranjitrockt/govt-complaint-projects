package com.complaintSystem.repository;

import com.complaintSystem.entity.Complaint;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ComplaintRepository extends JpaRepository<Complaint, Long> {
    List<Complaint> findByUserId(Long userId);

        List<Complaint>findByDepartmentId(Long departmentId);

         List<Complaint> findByStatus(String status);
}
