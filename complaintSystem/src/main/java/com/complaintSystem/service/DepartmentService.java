package com.complaintSystem.service;

import com.complaintSystem.dto.DepartmentDto;
import com.complaintSystem.entity.Department;

import java.util.List;

public interface DepartmentService {

    DepartmentService cretateDepartment(DepartmentDto dto);

    List<Department> getAllDepartments();

    Department getDepartmentById(Long id);


        void deleteDepartment(Long id);

        Department updateDepartment(Long id, DepartmentDto dto);

}
