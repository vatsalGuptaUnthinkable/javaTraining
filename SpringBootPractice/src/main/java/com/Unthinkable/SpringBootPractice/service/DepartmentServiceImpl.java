package com.Unthinkable.SpringBootPractice.service;
import com.Unthinkable.SpringBootPractice.entity.Department;
import com.Unthinkable.SpringBootPractice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

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
    public Department fetchDepartmentById(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteById(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateById(Long departmentId, Department department) {
        Department department1 = departmentRepository.findById(departmentId).get();

        if(department1.getDeparmentName() != null && !(department1.getDeparmentName().equalsIgnoreCase(department.getDeparmentName()))){
            department1.setDeparmentName(department.getDeparmentName());
        }
        if(department1.getDepartmentCode() != null && !(department1.getDepartmentCode().equalsIgnoreCase(department.getDepartmentCode()))){
            department1.setDepartmentCode(department.getDepartmentCode());
        }
        if(department1.getDepartmentAddress() != null && !(department1.getDepartmentAddress().equalsIgnoreCase(department.getDepartmentAddress()))){
            department1.setDepartmentAddress(department.getDepartmentAddress());
        }
        return departmentRepository.save(department1);
    }


}
