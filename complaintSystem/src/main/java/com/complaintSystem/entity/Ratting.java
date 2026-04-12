package com.complaintSystem.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ratings")

public class Ratting {
    @Id

    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private int stars; // 1 to 5

    private String feedback;

    private  Complaint complaint;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
