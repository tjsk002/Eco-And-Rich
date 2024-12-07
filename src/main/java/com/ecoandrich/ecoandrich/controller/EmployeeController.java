package com.ecoandrich.ecoandrich.controller;

import com.ecoandrich.ecoandrich.service.EmployeeService;
import com.ecoandrich.ecoandrich.service.JobHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private JobHistoryService jobHistoryService;

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

    @GetMapping("/employee/detail")
    public String employeeDetail(Model model, @RequestParam("id")Integer id){
        model.addAttribute("detail", jobHistoryService.jobHistoryDetail(id));
        return "employeeDetail";
    }
}
