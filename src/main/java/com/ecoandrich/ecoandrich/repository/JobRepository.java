package com.ecoandrich.ecoandrich.repository;

import com.ecoandrich.ecoandrich.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {

}