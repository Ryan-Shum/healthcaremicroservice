package com.example.patient.serviceClient;

import com.example.patient.entity.Patient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class PatientClient {

    private final RestTemplate restTemplate;

    @Value("${patientAdaptor.url}")
    private String url;

    @Value("${appointmentAdaptor.url}")
    private String appointmentUrl;

    @Value("${recordsAdaptor.url}")
    private String recordsUrl;

    public PatientClient(RestTemplateBuilder restTemplate) {
        this.restTemplate = restTemplate.build();
    }

    public Patient getBillingInformation(String patientId){

        Patient patient = restTemplate.getForObject(url, Patient.class, patientId);
        System.out.print(patientId);
        return patient;
    }

    public Patient getAppointmentInformation(String patientId){
        Patient patient = restTemplate.getForObject(appointmentUrl, Patient.class, patientId);
        return patient;
    }

    public Patient getRecordsInformation(String patientId){
        Patient patient = restTemplate.getForObject(recordsUrl, Patient.class, patientId);
        return patient;
    }
}
