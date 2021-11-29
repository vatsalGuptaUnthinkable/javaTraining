package org.unthinkable.SpringDataJpa.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.unthinkable.SpringDataJpa.Entity.Student;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository ;


    @Test
    public void findByFirstName(){
        List<Student> students = studentRepository.findByFirstName("Vatsal");
        System.out.println(students);
    }

    @Test
    public void deleteByFirstName(){
        studentRepository.deleteById(2L);
    }




}