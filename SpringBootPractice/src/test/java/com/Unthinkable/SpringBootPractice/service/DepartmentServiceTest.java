package com.Unthinkable.SpringBootPractice.service;

import com.Unthinkable.SpringBootPractice.Error.DepartmentNotFound;
import com.Unthinkable.SpringBootPractice.entity.Department;
import com.Unthinkable.SpringBootPractice.repository.DepartmentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DepartmentServiceTest {


    @Autowired
    private DepartmentService departmentService;

    @MockBean
    private DepartmentRepository departmentRepository;

    @BeforeEach
    void setUp() {
        Department mockDepartment = Department.builder()
                .departmentName("IT")
                .departmentHead("Deepak")
                .DepartmentId(1L)
                .build();

        Mockito.when(departmentRepository.findByDepartmentName("IT")).
                thenReturn(mockDepartment);
    }

    @Test
    public void whenValidDepartmentName_departmentShouldBeFound()
                                    throws DepartmentNotFound {

        String departmentName = "IT";
        Department found = departmentService
                            .fetchDepartmentByName(departmentName);
        assertEquals(departmentName,found.getDepartmentName());
    }

}