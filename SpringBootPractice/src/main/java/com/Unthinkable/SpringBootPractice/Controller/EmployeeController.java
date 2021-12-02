package com.Unthinkable.SpringBootPractice.Controller;

import com.Unthinkable.SpringBootPractice.entity.Employee;
import com.Unthinkable.SpringBootPractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee/{dId}")
    public Employee saveEmployee(@PathVariable("dId") long Did ,
                                    @RequestBody  Employee employee){
        return employeeService.saveEmployee(Did,employee);
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployee();
    }


    @GetMapping("/employee/{id}")
    public Employee getById(@PathVariable("id") long id){
        return employeeService.getById(id);
    }


    @DeleteMapping("/employee/{id}")
    public String deleteById (@PathVariable("id") long id) {
        return employeeService.deleteById(id);
    }

    
}
