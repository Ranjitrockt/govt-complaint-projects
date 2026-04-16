package com.complaintSystem.dto;

import lombok.Data;

@Data
public class ComplaintDto {


        private String title;
        private String description;
        private String district;

        private Long userId;
        private Long departmentId;
    }

