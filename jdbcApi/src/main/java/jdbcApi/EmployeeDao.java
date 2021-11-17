package jdbcApi;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao {
	Connection con = new ConnectionApi().connect();
	public boolean insertEmployee(Employee emp) throws SQLException {
		
		
		String name = emp.getName();
		String age = String.valueOf(emp.getAge());
		String sqlQuery = "Insert into Emp value(id,?,?)";
		PreparedStatement pt = con.prepareStatement(sqlQuery);
		pt.setString(1, name);
		pt.setString(2, age);
		if(pt.executeUpdate() == 1) {
			return true;
		}else {
			return false;
		}
	
	}
	public boolean deleteEmployee(int eid, String name) throws SQLException {
		String sqlQuery = "Delete From Emp Where id = ? && name = ? " ;
		PreparedStatement pt = con.prepareStatement(sqlQuery);
		pt.setInt(1, eid);
		pt.setString(1, name);
		return true;
	}
	public Employee search(String name) {
		
		String nameEmp = "";
		String age = "";
		return new Employee();
	}
	
}
