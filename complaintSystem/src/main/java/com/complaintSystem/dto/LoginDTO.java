package com.complaintSystem.dto;

import lombok.Data;

@Data
public class LoginDTO {
    private String email;
    private String mobileNumber;
    private String password;
}
