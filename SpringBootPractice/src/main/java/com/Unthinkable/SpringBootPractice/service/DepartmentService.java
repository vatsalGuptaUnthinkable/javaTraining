package com.Unthinkable.SpringBootPractice.service;

import com.Unthinkable.SpringBootPractice.entity.Department;

import java.util.List;

public interface DepartmentService {
        Department saveDepartment(Department department);
        List<Department> fetchDepartment();
        Department fetchDepartmentById(Long departmentId);
        void deleteById(Long departmentId);
        Department updateById(Long departmentId, Department department);
}
