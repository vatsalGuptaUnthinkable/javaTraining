package com.Unthinkable.SpringBootPractice.service;

import com.Unthinkable.SpringBootPractice.Error.DepartmentNotFound;
import com.Unthinkable.SpringBootPractice.entity.Department;

import java.util.List;

public interface DepartmentService {
        Department saveDepartment(Department department);
        List<Department> fetchDepartment();
        Department fetchDepartmentById(Long departmentId) throws DepartmentNotFound;
        void deleteById(Long departmentId);
        Department updateById(Long departmentId, Department department);
        Department fetchDepartmentByName(String name) throws DepartmentNotFound;
}
