package com.example.patient.controller;

import com.example.patient.service.BillingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillingController {

    private final BillingService billingService;

    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    @GetMapping("/addRecord/{sku}")
    public String addRecord(@PathVariable String sku){
        billingService.addRecord(sku);
        return "Record added !!";
    }


}
