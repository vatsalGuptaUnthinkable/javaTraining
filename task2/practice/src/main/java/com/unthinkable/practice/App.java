package com.unthinkable.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	ApplicationContext con = new ClassPathXmlApplicationContext("config.xml");
    	Student st1 = (Student) con.getBean("student1");
    	Student st2 = (Student) con.getBean("student2");
    	System.out.println(st1);
    	System.out.println(st2);
    }
}
