package com.unthinkable.practice;

import java.awt.List;

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
//    	Address ad1 = (Address) con.getBean("ad1");
//    	Address ad2 = (Address) con.getBean("ad2");

    	System.out.println(st1);
    	System.out.println(st2);
//    	System.out.println(ad1);
//    	System.out.println(ad2);
    }
}
