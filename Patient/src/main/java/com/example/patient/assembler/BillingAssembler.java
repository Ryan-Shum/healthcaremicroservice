package com.example.patient.assembler;

import com.example.patient.entity.Billing;
import com.example.patient.entity.Patient;
import org.springframework.stereotype.Component;

@Component
public class BillingAssembler {

    public Billing apply(Patient patient) {
        return Billing.builder()
                .patientId(patient.getPatientId())
                .BillingName(patient.getBillingName())
                .BillingAmount(patient.getBillingAmount())
                .build();
    }
}
