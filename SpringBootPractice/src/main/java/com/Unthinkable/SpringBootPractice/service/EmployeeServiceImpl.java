package com.Unthinkable.SpringBootPractice.service;

import com.Unthinkable.SpringBootPractice.entity.Department;
import com.Unthinkable.SpringBootPractice.entity.Employee;
import com.Unthinkable.SpringBootPractice.repository.DepartmentRepository;
import com.Unthinkable.SpringBootPractice.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Employee saveEmployee(long did, Employee employee) {
     Department department = departmentRepository.findById(did).get();
     employee.setDepartment(department);
    return employeeRepository.save(employee);
    }
}
