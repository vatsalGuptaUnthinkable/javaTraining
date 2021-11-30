package com.Unthinkable.SpringBootPractice.Controller;
import com.Unthinkable.SpringBootPractice.entity.Department;
import com.Unthinkable.SpringBootPractice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartment(@RequestBody Department department){
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<Department> fetchDepartment(){
        return departmentService.fetchDepartment();
    }
}
