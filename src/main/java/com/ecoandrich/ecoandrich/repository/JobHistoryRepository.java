package com.ecoandrich.ecoandrich.repository;

import com.ecoandrich.ecoandrich.entity.JobHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobHistoryRepository extends JpaRepository<JobHistory, Integer> {

}