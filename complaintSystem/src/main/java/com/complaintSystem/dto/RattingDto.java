package com.complaintSystem.dto;

import lombok.Data;

@Data
public class RattingDto {
    private int stars; // 1 to 5

    private String feedback;

    private Long userId;

    private Long complaintId;
}
