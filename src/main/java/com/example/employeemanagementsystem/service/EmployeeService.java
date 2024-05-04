// EmployeeService.java
package com.example.employeemanagementsystem.service;

import com.example.employeemanagementsystem.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    Employee createEmployee(Employee employee);

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);

    List<Employee> getEmployeeByName(String name);
}
