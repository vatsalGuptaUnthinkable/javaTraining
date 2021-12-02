package com.Unthinkable.SpringBootPractice.Controller;

import com.Unthinkable.SpringBootPractice.entity.Employee;
import com.Unthinkable.SpringBootPractice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee/{dId}")
    public Employee saveEmployee(@PathVariable("dId") long Did ,
                                    @RequestBody  Employee employee){
        return employeeService.saveEmployee(Did,employee);
    }
}
