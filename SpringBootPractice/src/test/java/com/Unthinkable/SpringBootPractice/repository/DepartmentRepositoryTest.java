package com.Unthinkable.SpringBootPractice.repository;

import com.Unthinkable.SpringBootPractice.entity.Department;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DepartmentRepositoryTest {


    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private DepartmentRepository departmentRepository;


    @BeforeEach
    void setUp() {
        Department mockDepartment = Department.builder()
                .departmentName("IT")
                .departmentHead("Deepak")
                .DepartmentId(1L)
                .build();

        Mockito.when(departmentRepository.findById(1L).get()).thenReturn(mockDepartment);
    }

    @Test
    private void whenDepartmentExist_thenReturnDepartment() {
        Department dept = departmentRepository.findById(1L).get();
        assertEquals("IT", dept.getDepartmentName());
    }
}