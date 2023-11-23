package com.employee.finalTest.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employeesdata")
public class Employee {
    @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    
    public Employee() {
    }
  
    private String name;
    private String email;
    private String dptType;
    private String salary;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDptType() {
        return dptType;
    }
    public void setDptType(String dptType) {
        this.dptType = dptType;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    
      @Override
    public String toString() {
        return "Employee [name=" + name + ", email=" + email + ", dptType=" + dptType + ", salary=" + salary + "]";
    }
}
