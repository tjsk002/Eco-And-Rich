package com.ecoandrich.ecoandrich.service;

import com.ecoandrich.ecoandrich.entity.JobHistory;
import com.ecoandrich.ecoandrich.repository.JobHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobHistoryService {
    @Autowired
    private JobHistoryRepository jobHistoryRepository;

    public List<JobHistory> jobHistoryList(){
        return jobHistoryRepository.findAll();
    }

    public JobHistory getEmployeeById(Integer id) {
        return jobHistoryRepository.findById(id).orElse(null);
    }
}