package com.example.appointment.service;

import com.example.appointment.entity.Appointment;
import com.example.appointment.repository.AppointmentRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    public void addAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    public Appointment getAppointment(String patientId) {
        return appointmentRepository.findByPatientId(patientId);
    }
}
