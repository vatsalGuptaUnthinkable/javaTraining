package com.Unthinkable.SpringBootPractice.repository;

import com.Unthinkable.SpringBootPractice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
