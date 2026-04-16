package com.complaintSystem.service;

import com.complaintSystem.dto.OfficerDto;
import com.complaintSystem.entity.Officer;

import java.util.List;

public interface OfficerService {
    Officer createOfficer(OfficerDto dto);

    //  get all
    List<Officer> getAllOfficers();

    //  get by id
    Officer getOfficerById(Long id);

    //  department wise
    List<Officer> getOfficersByDepartment(Long departmentId);

    //  district wise
    List<Officer> getOfficersByDistrict(String district);

    //  update
    Officer updateOfficer(Long id, OfficerDto dto);

    //  delete
    void deleteOfficer(Long id);
}
