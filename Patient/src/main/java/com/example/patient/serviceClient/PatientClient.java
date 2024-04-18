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

    public PatientClient(RestTemplateBuilder restTemplate) {
        this.restTemplate = restTemplate.build();
    }

    public Patient getBillingInformation(String sku){

        Patient patient = restTemplate.getForObject(url, Patient.class, sku);
        return patient;
    }
}
