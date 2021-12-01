package com.Unthinkable.SpringBootPractice.Controller;
import com.Unthinkable.SpringBootPractice.entity.Department;
import com.Unthinkable.SpringBootPractice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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


    @GetMapping("/department/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId){
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/department/{id}")
    public String DeleteById(@PathVariable("id") Long departmentId){
        departmentService.deleteById(departmentId);
        return "You Have Succesfully Deleted the user with id = " + departmentId;
    }

    @PutMapping("/department/{id}")
    public Department updateById(@PathVariable("id") Long departmentId,
                                 @RequestBody Department department
                                 ){
        return departmentService.updateById(departmentId,department);
    }

    @GetMapping("/departmentByName/{name}")
    public Department fetchDataByName(@PathVariable("name") String name){
        return departmentService.fetchDepartmentByName(name);
    }
}
