package com.Unthinkable.SpringBootPractice.service;

import com.Unthinkable.SpringBootPractice.entity.Employee;

public interface EmployeeService {
    Employee saveEmployee(long did, Employee employee);
}
