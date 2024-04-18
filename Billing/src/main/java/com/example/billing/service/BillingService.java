package com.example.billing.service;

import com.example.billing.entity.Billing;
import com.example.billing.repository.BillingRepository;
import org.springframework.stereotype.Service;

@Service
public class BillingService {

    private final BillingRepository billingRepository;

    public BillingService(BillingRepository billingRepository) {
        this.billingRepository = billingRepository;
    }

    public void addBilling(Billing billing) {
        billingRepository.save(billing);
    }

    public Billing getBilling(String sku) {
       return billingRepository.findBySku(sku);
    }
}
