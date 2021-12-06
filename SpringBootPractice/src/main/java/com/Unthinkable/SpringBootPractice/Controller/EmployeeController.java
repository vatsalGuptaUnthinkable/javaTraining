package com.Unthinkable.SpringBootPractice.Controller;

import com.Unthinkable.SpringBootPractice.entity.Employee;
import com.Unthinkable.SpringBootPractice.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@RestController
public class EmployeeController {

    private final Logger logger =
            LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/employee/{dId}")
    public Employee saveEmployee(@PathVariable("dId") long Did ,
                                    @RequestBody  Employee employee){
        logger.info("Inside Save Employee()");
        return employeeService.saveEmployee(Did,employee);
    }

    @GetMapping("/employee")
    public List<Employee> getAllEmployees(){

        logger.info("Inside Get all Employee()");
        return employeeService.getAllEmployee();
    }


    @GetMapping("/employee/{id}")
    public Employee getById(@PathVariable("id") long id)
    {
        logger.info("Inside Employee Get By id()");
        return employeeService.getById(id);
    }


    @DeleteMapping("/employee/{id}")
    public String deleteById (@PathVariable("id") long id) {
        logger.info("Inside Delete Employee()");
        return employeeService.deleteById(id);
    }

}
