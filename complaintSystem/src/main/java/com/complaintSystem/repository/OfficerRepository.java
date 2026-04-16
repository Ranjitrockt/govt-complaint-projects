package com.complaintSystem.repository;

import com.complaintSystem.entity.Officer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OfficerRepository extends JpaRepository<Officer,Long> {


        List<Officer> findByDepartmentId(Long departmentId);

        List<Officer> findByDistrictId(Long districtId);
}
