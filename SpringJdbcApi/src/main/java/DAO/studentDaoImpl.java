package DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import entity.Student;

public class studentDaoImpl implements StudentDAO{
	private JdbcTemplate jd;
	public JdbcTemplate getJd() {
		return jd;
	}
	public void setJd(JdbcTemplate jd) {
		this.jd = jd;
	}
	public int insert(Student st) {
		
		String sql ="INSERT INTO student(id,name,city) values(?,?,?)";
		int result = this.jd.update(sql,st.getId() , st.getName() , st.getCity());
		System.out.println("Number of rows executed are = " + result);
		return result;
	}
	public int change(Student st) {
		String sql ="Update student set name = ? , city = ? where id = ?";
		int result = this.jd.update(sql, st.getName(), st.getCity() ,st.getId());
		System.out.println("Number of rows executed are = " + result);
		return result;
	}
	public int delete(int num) {
		String sql ="DELETE FROM student  WHERE id = ?";
		int result = this.jd.update(sql, num);
		System.out.println("Number of rows executed are = " + result);
		return result;
	}
	public Student getStudent(int id) {
		String sql = "Select * From student where id = ?";
		Student st = this.jd.queryForObject(sql, new rowMapperImpl(), id);
		return st;
	}
	public List<Student> getStudents() {
		String sql = "Select * From student" ;
		List<Student> students = this.jd.query(sql,new rowMapperImpl());
		return students;
	}

}
