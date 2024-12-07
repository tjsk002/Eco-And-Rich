package com.ecoandrich.ecoandrich.service;

import com.ecoandrich.ecoandrich.entity.Department;
import com.ecoandrich.ecoandrich.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    private DepartmentRepository DepartmentRepository;

    public List<Department> departmentList(){
        return DepartmentRepository.findAll();
    }

    public Department getDepartmentById(Integer id) {
        return DepartmentRepository.findById(id).orElse(null);
    }
}