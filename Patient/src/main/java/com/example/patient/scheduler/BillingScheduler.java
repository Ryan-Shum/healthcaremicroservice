package com.example.patient.scheduler;

import com.example.patient.service.BillingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class BillingScheduler {

    private final BillingService billingService;

    public BillingScheduler(BillingService billingService) {
        this.billingService = billingService;
    }

    @Scheduled(cron = "0 * * ? * *")
    public void updateDataBase() {
        log.info("----------Job Started------------------");
        log.info("Database refresh");
        log.info("----------Job ended--------------------");
    }
}
