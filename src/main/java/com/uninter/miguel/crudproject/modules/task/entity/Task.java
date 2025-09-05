package com.uninter.miguel.crudproject.modules.task.entity;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity(name = "usertask")
@Data
public class Task {
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private LocalDate date;
    @Column(nullable = false)
    private String responsable;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
