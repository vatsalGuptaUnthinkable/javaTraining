package org.unthinkable.SpringDataJpa.Service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.unthinkable.SpringDataJpa.Entity.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

public List<Student> findByFirstName(String st);


}
