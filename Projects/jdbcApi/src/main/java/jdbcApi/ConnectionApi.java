package jdbcApi;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionApi {
	Connection con;
	String url= "jdbc:mysql://localhost:3306/Employee";
	String userName = "root";
	String password = "hrhk";
	public Connection connect(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
		
			con = DriverManager.getConnection(url, userName, password);
			System.out.println("Db Connected");
		}catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
