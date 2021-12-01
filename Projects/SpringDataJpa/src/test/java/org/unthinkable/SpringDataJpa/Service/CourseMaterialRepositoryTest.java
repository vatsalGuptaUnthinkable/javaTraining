package org.unthinkable.SpringDataJpa.Service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.unthinkable.SpringDataJpa.Entity.Course;
import org.unthinkable.SpringDataJpa.Entity.CourseMaterial;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
class CourseMaterialRepositoryTest {


    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void saveCourseMatrial(){
        Course first = Course.builder()
                .title("Maths")
                .credit(5)
                .build();


        courseRepository.save(first);
        CourseMaterial courseMaterial = CourseMaterial.builder()
                                        .course(first)
                                        .url("www.Math.com")
                                        .build();

        courseMaterialRepository.save(courseMaterial);
    }

    @Test
    public  void print(){
        System.out.println("hello");
    }
}