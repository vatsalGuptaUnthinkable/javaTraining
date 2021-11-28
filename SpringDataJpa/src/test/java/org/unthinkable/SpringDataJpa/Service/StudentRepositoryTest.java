package org.unthinkable.SpringDataJpa.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.unthinkable.SpringDataJpa.Entity.Gaurdian;
import org.unthinkable.SpringDataJpa.Entity.Student;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){

        Student st1 = Student.builder()
                .emailId("checking@gmail.com")
                .firstName("Vatsal")
                .lastName("gupta")
                .gaurdian(Gaurdian.builder()
                        .gaurdianName("Sameer")
                        .gaurdianEmail("checlk")
                        .gaurdianMobile("987").
                        build())
                .build();

        studentRepository.save(st1);
    }
    @Test
    public void printAllStudent(){
        List<Student> student = studentRepository.findAll();
        System.out.println(student);
    }
}