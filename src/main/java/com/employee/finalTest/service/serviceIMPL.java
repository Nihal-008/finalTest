package com.employee.finalTest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.finalTest.model.Employee;
import com.employee.finalTest.repositary.empRepo;
@Service
public class serviceIMPL implements service {
@Autowired 
private empRepo obj;
    @Override
    public void addEmployee(Employee empDetails) {
       obj.save(empDetails);
    }
    
}
