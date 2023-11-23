package com.employee.finalTest.controller;

import java.util.List;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.employee.finalTest.model.Employee;

import com.employee.finalTest.service.service;



@Controller
public class EmployeeController {
    @Autowired
    private service srv;
    @GetMapping("/index")
    public String indexPage(){
        System.out.println("index page");
        return "index";
    }
    @GetMapping("/addEmp")
    public String signUpEmpPage(Employee employee) {
    
        return "addEmp";
    }
    
    @PostMapping("/addEmp")
    public String addEmp(@ModelAttribute Employee employee){
       srv.addEmployee(employee);
        return "redirect:/showEmp";
    }
    @GetMapping("/showEmp")
    public String getAllEmployees(Model model) {
        List<Employee> employees = srv.getAllEmployees();
        model.addAttribute("employees", employees); // Use "employees" as the key
        return "showEmp";
    }
    
       @GetMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id) {
       
    srv.deleteEmployee(id);
        
       
        return "redirect:/showEmp";
    }
    
    

    
    
    }

    

