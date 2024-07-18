package com.example.practice_project.domain.member;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "t_bank")
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
}
