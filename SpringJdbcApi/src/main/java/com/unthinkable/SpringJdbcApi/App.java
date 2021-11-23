package com.unthinkable.SpringJdbcApi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;


public class App 
{

	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext con = new ClassPathXmlApplicationContext("com/unthinkable/SpringJdbcApi/config.xml");
        
		JdbcTemplate js = (JdbcTemplate) con.getBean("jdT");
		
		String sql = "Insert into student(id,name,city) values(?,?,?)";
		int result = js.update(sql,1,"vatsal","kanpur");
		System.out.println("The number of rows executed are + =" + result);
    }
}
