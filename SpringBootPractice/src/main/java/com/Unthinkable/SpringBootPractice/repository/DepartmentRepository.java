package com.Unthinkable.SpringBootPractice.repository;

import com.Unthinkable.SpringBootPractice.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {
    public Department findByDeparmentName(String name);
}
