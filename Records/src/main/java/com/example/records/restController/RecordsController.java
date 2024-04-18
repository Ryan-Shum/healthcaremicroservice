package com.example.records.restController;

import com.example.records.entity.Records;
import com.example.records.service.RecordsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class RecordsController {

        private final RecordsService recordsService;

        public RecordsController(RecordsService recordsService) {
            this.recordsService = recordsService;
        }

        @PostMapping("/addRecord")
        public String addNewRecord(@RequestBody Records record){
                recordsService.addRecord(record);
                return "Record added Successfully !!";
        }

        @GetMapping("/record/{patientId}")
        public Records getRecordBySku(@PathVariable String patientId){
                return recordsService.getRecord(patientId);
        }
}
