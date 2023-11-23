package com.employee.finalTest.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.finalTest.model.Employee;

public interface empRepo extends JpaRepository<Employee, Integer>  {
    
}
