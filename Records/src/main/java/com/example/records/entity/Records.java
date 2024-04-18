package com.example.records.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Records {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String patientId;
    private String name;
    private String recordType;
}
