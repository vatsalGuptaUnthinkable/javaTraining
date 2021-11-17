package jdbcApi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws IOException, SQLException {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		
		
		while(true) {
			System.out.println("Enter your choice ");
			System.out.println("Press 1 to add Employee to the database ");
			System.out.println("Enter 2 to delete employee from the database ");
			System.out.println("Press 3 to search for employee on the databse ");
			System.out.println("Press 4 to exit the system application ");
			int choice = Integer.parseInt(reader.readLine());
			switch(choice) {
			case 1:
				 System.out.println("Enter your name: ");
			      String name = reader.readLine();
			      System.out.println("Enter your age: ");
			      int age = Integer.parseInt(reader.readLine());
			      
			      Employee emp = new Employee(name, age);
			      System.out.println(emp);
			      if(new EmployeeDao().insertEmployee(emp)) {
			    	  System.out.println("Employee Added");
			      }else {
			    	  System.out.println("Some error occured kindly do this agin");
			      }
				break;
			case 2:
				System.out.println("Enter the id of the Employee that has to be deleted");
				int id = Integer.parseInt(reader.readLine());
				System.out.println("Enter the name of the Employee that has to be deleted");
				String Ename = reader.readLine();
				if(new EmployeeDao().deleteEmployee(id,Ename)) {
					System.out.println("Deleted Employee with id number " + id);
				}else {
					System.out.println("Kindly check the inputs again");
				}
				break;
			case 3:
				System.out.println("Enter the name of the Employee");
				String nameToSearch = reader.readLine();
				if(new EmployeeDao().search(nameToSearch) != null) {
					System.out.println("Found your Employee");
					System.out.println(new EmployeeDao().search(nameToSearch));
				}else {
					System.out.println("Sorry No body with that name kindly check the spelling and enter agin");
				}
				break;
			case 4:
				System.out.println("Good-Bye -- Have a nice day");
				System.exit(1);
			
				default:
				 break;
			}
		    
		}

	}

}
