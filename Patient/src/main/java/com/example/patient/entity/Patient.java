package com.example.patient.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    private int id;
    private int patientId;
    private String name;
    private String email;
    private String sku;
    private String billingName;
    private int billingAmount;
}
