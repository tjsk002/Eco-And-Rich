package com.ecoandrich.ecoandrich.controller;

import com.ecoandrich.ecoandrich.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String employeeList(Model model){
        model.addAttribute("list", employeeService.employeeList());
        return "employeeList";
    }
}
