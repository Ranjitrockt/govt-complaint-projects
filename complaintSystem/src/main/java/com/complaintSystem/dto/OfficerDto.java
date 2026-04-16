package com.complaintSystem.dto;

import lombok.Data;

@Data
public class OfficerDto {
    private String name;
    private String email;
    private String role;
    private String password;
    private String district;
    private Long departmentId;

}
