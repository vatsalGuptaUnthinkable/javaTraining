package com.unthinkable.SpringJdbcApi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import DAO.studentDaoImpl;
import entity.Student;


public class App 
{

	private static ApplicationContext con;

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        con = new ClassPathXmlApplicationContext("com/unthinkable/SpringJdbcApi/config.xml");
        studentDaoImpl st = (studentDaoImpl) con.getBean("studentDaoClass");
        Student st1 = (Student)  con.getBean("st1");
        System.out.println(st1);
        
        //Inserting through config.xml
        st.insert(st1);
        
        
		
		
		
    }
}
