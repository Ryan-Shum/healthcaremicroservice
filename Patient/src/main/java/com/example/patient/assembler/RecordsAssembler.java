package com.example.patient.assembler;

import com.example.patient.entity.Patient;
import com.example.patient.entity.Records;
import org.springframework.stereotype.Component;

@Component
public class RecordsAssembler {

    public Records apply(Patient patient) {
        return Records.builder()
                .patientId((patient.getPatientId()))
                .name(patient.getName())
                .recordType(patient.getRecordType())
                .build();
    }
}
