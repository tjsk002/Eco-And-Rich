package com.ecoandrich.ecoandrich.controller;

import com.ecoandrich.ecoandrich.entity.Employee;
import com.ecoandrich.ecoandrich.service.EmployeeService;
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

    @GetMapping("/employee/list/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Integer id) {
        Employee employee = employeeService.getEmployeeById(id);
        if (employee != null) {
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}
