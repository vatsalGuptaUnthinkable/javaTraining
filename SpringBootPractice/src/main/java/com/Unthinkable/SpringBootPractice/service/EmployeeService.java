package com.Unthinkable.SpringBootPractice.service;

import com.Unthinkable.SpringBootPractice.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee saveEmployee(long did, Employee employee);
    List<Employee> getAllEmployee();
    Employee getById(long id);
    String deleteById(long id);
    Employee getEmployeeByName(String name);
}
