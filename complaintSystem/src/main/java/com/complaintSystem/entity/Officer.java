package com.complaintSystem.entity;

import jakarta.persistence.*;
import lombok.Data;


    @Entity
    @Table(name = "officers")
    @Data
    public class Officer {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String name;

        private String role; // DM, SDM, OFFICER

        private String district;

        // 🔥 Officer belongs to one department
        @ManyToOne
        @JoinColumn(name = "department_id")
        private Department department;
    }

