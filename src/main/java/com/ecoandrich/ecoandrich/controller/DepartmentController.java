package com.ecoandrich.ecoandrich.controller;

import com.ecoandrich.ecoandrich.entity.Department;
import com.ecoandrich.ecoandrich.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/department/list")
    public ResponseEntity<List<Department>> departmentList() {

        List<Department> departmentList = departmentService.getDepartmentList();
        if (departmentList != null && !departmentList.isEmpty()) {
            return ResponseEntity.ok(departmentList);
        }else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new ArrayList<>());
        }
    }

    @GetMapping("/department/{id}")
    public ResponseEntity<Department> getEmployeeById(@PathVariable("id") Integer id) {
        Department department = departmentService.getDepartmentById(id);
        if (department != null) {
            return ResponseEntity.ok(department);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
    }
}