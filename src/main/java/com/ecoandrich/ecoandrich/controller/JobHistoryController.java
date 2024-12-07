package com.ecoandrich.ecoandrich.controller;

import com.ecoandrich.ecoandrich.entity.JobHistory;
import com.ecoandrich.ecoandrich.service.JobHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JobHistoryController {
    @Autowired
    private JobHistoryService jobHistoryService;

    @GetMapping("/job-history/list")
    public ResponseEntity<List<JobHistory>> jobHistoryList() {
        List<JobHistory> jobHistoryList = jobHistoryService.jobHistoryList();

        if (jobHistoryList != null && !jobHistoryList.isEmpty()) {
            return ResponseEntity.ok(jobHistoryList);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ArrayList<>());
        }
    }

    @GetMapping("/job-history/list/{id}")
    public ResponseEntity<JobHistory> getEmployeeById(@PathVariable("id") Integer id) {
        JobHistory jobHistory = jobHistoryService.getEmployeeById(id);
        if (jobHistory != null) {
            return ResponseEntity.ok(jobHistory);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
