package org.unthinkable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class App 
{
    public static void main( String[] args )
    {


        System.out.println( "Project Started " );
        SessionFactory sessionFactory = new Configuration().configure(new File("/home/unthinkable-lap-0201/IdeaProjects/HibernatePractice/src/main/java/hibernate.cfg.xml")).buildSessionFactory();

        Student st = new Student(2,"Hrithik","Rajasthan");
        System.out.println(st);
        Session sess = sessionFactory.openSession();
        sess.beginTransaction();
        sess.save(st);
        sess.getTransaction().commit();
        sess.close();



    }
}
