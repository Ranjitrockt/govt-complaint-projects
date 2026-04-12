package com.complaintSystem.entity;

import jakarta.persistence.*;

import java.util.List;

public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    private String description;

    @OneToMany (mappedBy="department")
    private List<Complaint> complaints;



}
