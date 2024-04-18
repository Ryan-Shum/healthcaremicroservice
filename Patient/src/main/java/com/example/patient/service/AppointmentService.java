package com.example.patient.service;

import com.example.patient.assembler.AppointmentAssembler;
import com.example.patient.entity.Patient;
import com.example.patient.repository.AppointmentRepository;
import com.example.patient.serviceClient.PatientClient;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final PatientClient patientClient;
    private final AppointmentAssembler appointmentAssembler;

    public AppointmentService(AppointmentRepository appointmentRepository, PatientClient patientClient, AppointmentAssembler appointmentAssembler) {
        this.appointmentRepository = appointmentRepository;
        this.patientClient = patientClient;
        this.appointmentAssembler = appointmentAssembler;
    }

    public void addAppointment(String patientId) {
        Patient patient = patientClient.getAppointmentInformation(patientId);

        if (!Objects.isNull(patient)) {
            appointmentRepository.save(appointmentAssembler.apply(patient));
        }
    }
}
