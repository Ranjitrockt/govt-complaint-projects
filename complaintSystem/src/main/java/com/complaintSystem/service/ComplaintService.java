package com.complaintSystem.service;

import com.complaintSystem.dto.ComplaintDto;
import com.complaintSystem.entity.Complaint;

import java.util.List;

public interface ComplaintService {
    Complaint createcomplaint(ComplaintDto dto);
   Complaint getComplaintById(Long Id);

   List<Complaint> getAllComplaints();

   List<Complaint> getComplaintByUserId(Long userId);

   List<Complaint> getComplaintByDepartmentId(Long departmentId);

    List<Complaint> getComplaintByStatus(String status);

    Complaint updatComplaitStatus(Long id , String status);

       void deleteComplaint(Long id);





}
