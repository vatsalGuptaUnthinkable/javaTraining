package org.unthinkable.SpringDataJpa.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.unthinkable.SpringDataJpa.Entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course,Long> {
}
