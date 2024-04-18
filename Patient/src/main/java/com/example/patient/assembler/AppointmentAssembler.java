package com.example.patient.assembler;

import com.example.patient.entity.Appointment;
import com.example.patient.entity.Patient;
import org.springframework.stereotype.Component;

@Component
public class AppointmentAssembler {

    public Appointment apply(Patient patient) {
        return Appointment.builder()
                .patientId(patient.getPatientId())
                .patientName(patient.getPatientName())
                .appointmentDateTime(patient.getAppointmentDateTime())
                .build();
    }
}
