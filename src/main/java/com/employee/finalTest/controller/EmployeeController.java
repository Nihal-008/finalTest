package com.employee.finalTest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.finalTest.model.Employee;
import com.employee.finalTest.service.serviceIMPL;


import ch.qos.logback.core.model.Model;

@Controller
public class EmployeeController {
    @Autowired
    private serviceIMPL srv;
    @GetMapping("/index")
    public String indexPage(){
        System.out.println("index page");
        return "index";
    }
    @GetMapping("/addEmp")
    public String signUpEmpPage() {
       
        // model.addAttribute("employee", new Employee());
    
        return "addEmp";
    }
    
    @PostMapping("/addEmp")
    public String addEmp(@ModelAttribute Employee employee){
        srv.addEmployee(employee);
        return "redirect:/showEmp";
    }
    @GetMapping("/showEmp")
    public String showEmp(){
      return "showEmp";
    }
    
    }

    

