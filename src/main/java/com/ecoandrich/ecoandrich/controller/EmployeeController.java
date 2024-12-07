package com.ecoandrich.ecoandrich.controller;

import com.ecoandrich.ecoandrich.entity.Employee;
import com.ecoandrich.ecoandrich.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    @ResponseBody
    public String main(){
        return "main page";
    }

    @GetMapping("/employee/list")
    public ResponseEntity<List<Employee>> employeeList() {
        List<Employee> employeeList = employeeService.employeeList();

        if (employeeList != null && !employeeList.isEmpty()) {
            return ResponseEntity.ok(employeeList);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ArrayList<>());
        }
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id) {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }

    @PostMapping("/employee/{id}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable("id") Integer id, @RequestBody Employee employee) {
        System.out.println("employee " + employee);
        Employee employeeTemp = employeeService.getEmployeeById(id);
        employeeTemp.setFirstName(employee.getFirstName());
        employeeTemp.setLastName(employee.getLastName());
        employeeService.write(employeeTemp);

        return ResponseEntity.ok(employeeTemp);
    }
}