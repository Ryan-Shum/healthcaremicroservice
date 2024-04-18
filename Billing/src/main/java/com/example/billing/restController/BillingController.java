package com.example.billing.restController;

import com.example.billing.entity.Billing;
import com.example.billing.service.BillingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class BillingController {

    private final BillingService billingService;

    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    @PostMapping("/addBilling")
    public String addNewBilling(@RequestBody Billing billing){
        billingService.addBilling(billing);
        log.info("Billing is added Successfully !!");
        return "Billing is added Successfully !!";
    }

    @GetMapping("/billing/{sku}")
    public Billing getBillingBySku(@PathVariable String sku){
        return billingService.getBilling(sku);
    }
}
