package com.example.records.service;

import com.example.records.entity.Records;
import com.example.records.repository.RecordRepository;
import org.springframework.stereotype.Service;

@Service
public class RecordsService {

        private final RecordRepository recordRepository;

        public RecordsService(RecordRepository recordRepository) {
            this.recordRepository = recordRepository;
        }

        public void addRecord(Records record) {
            recordRepository.save(record);
        }

        public Records getRecord(String patientId) {
        return recordRepository.findByPatientId(patientId);
        }
}
