package com.ecoandrich.ecoandrich.service;

import com.ecoandrich.ecoandrich.entity.JobHistory;
import com.ecoandrich.ecoandrich.repository.JobHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JobHistoryService {
    @Autowired
    private JobHistoryRepository jobHistoryRepository;

    public JobHistory jobHistoryDetail(Integer id) {
        return jobHistoryRepository.findById(id).get();
    }
}