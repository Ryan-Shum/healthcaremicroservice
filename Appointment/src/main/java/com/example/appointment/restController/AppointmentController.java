package com.example.appointment.restController;

import com.example.appointment.entity.Appointment;
import com.example.appointment.service.AppointmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("/addAppointment")
    public String addNewAppointment(@RequestBody Appointment appointment){
        appointmentService.addAppointment(appointment);
        return "Appointment added Successfully !!";
    }

    @GetMapping("/appointment/{patientId}")
    public Appointment getAppointmentBySku(@PathVariable String patientId){
        return appointmentService.getAppointment(patientId);
    }

}
