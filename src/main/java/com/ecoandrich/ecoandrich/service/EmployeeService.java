package com.ecoandrich.ecoandrich.service;

import com.ecoandrich.ecoandrich.entity.Employee;
import com.ecoandrich.ecoandrich.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> employeeList(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    public void update(Employee employee){
        employeeRepository.save(employee);
    }
}
