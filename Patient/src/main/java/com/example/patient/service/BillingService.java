package com.example.patient.service;

import com.example.patient.assembler.*;
import com.example.patient.entity.Patient;
import com.example.patient.repository.BillingRepository;
import com.example.patient.serviceClient.PatientClient;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class BillingService {

    private final BillingRepository billingRepository;

    private final PatientClient patientClient;

    private final BillingAssembler billingAssembler;

    public BillingService(BillingRepository billingRepository , PatientClient patientClient, BillingAssembler billingAssembler) {
        this.billingRepository = billingRepository;
        this.patientClient = patientClient;
        this.billingAssembler = billingAssembler;
    }

    public void addRecord(String patientId){

        Patient patient = patientClient.getBillingInformation(patientId);

        if(!Objects.isNull(patient))      {
            billingRepository.save(billingAssembler.apply(patient))  ;
        }

    }
}
