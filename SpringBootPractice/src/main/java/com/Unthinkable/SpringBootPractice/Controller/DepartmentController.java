package com.Unthinkable.SpringBootPractice.Controller;
import com.Unthinkable.SpringBootPractice.Error.DepartmentNotFound;
import com.Unthinkable.SpringBootPractice.entity.Department;
import com.Unthinkable.SpringBootPractice.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.util.List;

@RestController
public class DepartmentController {

    private final Logger logger =
            LoggerFactory.getLogger(DepartmentController.class);

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/department")
    public Department saveDepartment(@Valid @RequestBody Department department){
        logger.info("Inside saveDepartment of Post Mapping");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/department")
    public List<Department> fetchDepartment(){
        logger.info("Inside fetch Department of Get Mapping");
        return departmentService.fetchDepartment();
    }


    @GetMapping("/department/{id}")
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) throws DepartmentNotFound {
        logger.info("Inside fetchDepartmentById of Get Mapping");
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/department/{id}")
    public String DeleteById(@PathVariable("id") Long departmentId){
        logger.info("Inside DeleteDepartment of Delete Mapping");
        departmentService.deleteById(departmentId);
        return "You Have Succesfully Deleted the user with id = " + departmentId;
    }

    @PutMapping("/department/{id}")
    public Department updateById(@PathVariable("id") Long departmentId,
                                 @RequestBody Department department
                                 ){
        logger.info("Inside updateById of Put Mapping");
        return departmentService.updateById(departmentId,department);
    }

    @GetMapping("/departmentByName/{name}")
    public Department fetchDataByName(@PathVariable("name") String name) throws DepartmentNotFound {
        return departmentService.fetchDepartmentByName(name);
    }
}
