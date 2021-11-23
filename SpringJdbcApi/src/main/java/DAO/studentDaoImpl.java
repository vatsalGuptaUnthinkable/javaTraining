package DAO;

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
		int result = jd.update(sql,st.getId() , st.getName() , st.getCity());
		System.out.println("Number of rows executed are = " + result);
		return result;
	}

}
