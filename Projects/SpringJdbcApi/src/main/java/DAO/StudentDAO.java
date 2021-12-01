package DAO;

import java.util.List;

import entity.Student;

public interface StudentDAO {
	public int insert(Student st);
	public int change(Student st);
	public int delete(int num);
	public Student getStudent(int id);
	public List<Student> getStudents();
}
