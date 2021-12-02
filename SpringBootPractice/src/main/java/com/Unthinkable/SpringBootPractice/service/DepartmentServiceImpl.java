package com.Unthinkable.SpringBootPractice.service;
import com.Unthinkable.SpringBootPractice.Error.DepartmentNotFound;
import com.Unthinkable.SpringBootPractice.entity.Department;
import com.Unthinkable.SpringBootPractice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {

        return departmentRepository.save(department);
    }

    @Override
    public List<Department> fetchDepartment() {
        return departmentRepository.findAll();
    }

    @Override
    public Department fetchDepartmentById(Long departmentId) throws DepartmentNotFound {
        Optional<Department> byId = departmentRepository.findById(departmentId);
        if(!byId.isPresent()){
            throw new DepartmentNotFound("Hey Kindly Check the Id Since this department is not in our database");
        }
        return byId.get();
    }

    @Override
    public void deleteById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateById(Long departmentId, Department department) {
        Department department1 = departmentRepository.findById(departmentId).get();

        if(department1.getDepartmentName() != null && !(department1.getDepartmentName().equalsIgnoreCase(department.getDepartmentName()))){
            department1.setDepartmentName(department.getDepartmentName());
        }
        if(department1.getDepartmentHead() != null && !(department1.getDepartmentHead().equalsIgnoreCase(department.getDepartmentHead()))){
            department1.setDepartmentHead(department.getDepartmentHead());
        }
        return departmentRepository.save(department1);
    }

    @Override
    public Department fetchDepartmentByName(String name) throws DepartmentNotFound {
        Department byDepartmentName = departmentRepository.findByDepartmentName(name);
        if(byDepartmentName == null){
            throw new DepartmentNotFound("Hey Kindly check the name since this name is not in our database");
        }
        return byDepartmentName;
    }


}
