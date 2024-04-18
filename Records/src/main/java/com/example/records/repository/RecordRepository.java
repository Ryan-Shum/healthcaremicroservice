package com.example.records.repository;

import com.example.records.entity.Records;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends JpaRepository<Records, Integer> {
        Records findByPatientId(String patientId);
}
