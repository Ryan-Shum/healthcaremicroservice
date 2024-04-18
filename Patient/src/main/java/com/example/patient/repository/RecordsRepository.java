package com.example.patient.repository;

import com.example.patient.entity.Records;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecordsRepository extends JpaRepository<Records, Integer> {
}
