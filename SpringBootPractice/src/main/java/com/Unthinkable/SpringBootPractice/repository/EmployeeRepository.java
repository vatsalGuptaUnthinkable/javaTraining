package com.Unthinkable.SpringBootPractice.repository;

import com.Unthinkable.SpringBootPractice.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
    public Employee findByEmployeeName(String name);
}
