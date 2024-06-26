package com.example.patient.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {

    private int id;
    private String patientId;
    private String name;
    private String email;
    private String billingName;
    private int billingAmount;
    private String patientName;
    private String appointmentDateTime;
    private String recordType;
}
