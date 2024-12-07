package com.ecoandrich.ecoandrich.repository;

import com.ecoandrich.ecoandrich.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}