package com.example.patient.service;

import com.example.patient.assembler.RecordsAssembler;
import com.example.patient.entity.Patient;
import com.example.patient.repository.RecordsRepository;
import com.example.patient.serviceClient.PatientClient;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class RecordsService {
    private final RecordsRepository recordsRepository;
    private final PatientClient patientClient;
    private final RecordsAssembler recordsAssembler;

    public RecordsService(RecordsRepository recordsRepository, PatientClient patientClient, RecordsAssembler recordsAssembler) {
        this.recordsRepository = recordsRepository;
        this.patientClient = patientClient;
        this.recordsAssembler = recordsAssembler;
    }

    public void addRecords(String patientId) {
        Patient patient = patientClient.getRecordsInformation(patientId);

        if (!Objects.isNull(patient)) {
            recordsRepository.save(recordsAssembler.apply(patient));
        }
    }


}
