package com.employee.finalTest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.finalTest.model.Employee;
import com.employee.finalTest.repositary.empRepo;
@Service
public class service {
    @Autowired
    private empRepo employeeRepository;
    public Employee addEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }
}
