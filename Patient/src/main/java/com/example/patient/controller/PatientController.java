package com.example.patient.controller;

import com.example.patient.service.AppointmentService;
import com.example.patient.service.BillingService;
import com.example.patient.service.RecordsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PatientController {

    private final BillingService billingService;
    private final AppointmentService appointmentService;
    private final RecordsService recordsService;

    public PatientController(BillingService billingService, AppointmentService appointmentService, RecordsService recordsService) {
        this.billingService = billingService;
        this.appointmentService = appointmentService;
        this.recordsService = recordsService;
    }

    @GetMapping("/addBilling/{patientId}")
    public String addRecord(@PathVariable String patientId){
        billingService.addRecord(patientId);
        return "Record added !!";
    }

    @GetMapping("/addAppointment/{patientId}")
    public String addAppointment(@PathVariable String patientId){
        appointmentService.addAppointment(patientId);
        return "Appointment added !!";
    }

    @GetMapping("/addPatientRecord/{patientId}")
    public String addPatientRecord(@PathVariable String patientId){
        recordsService.addRecords(patientId);
        return "Patient Record added !!";
    }
}
