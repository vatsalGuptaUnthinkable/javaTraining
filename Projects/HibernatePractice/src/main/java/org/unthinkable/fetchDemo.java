package org.unthinkable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class fetchDemo {
    public static void main(String args[]){
        System.out.println( "Project Started " );
        SessionFactory sessionFactory = new Configuration().configure(new File("/home/unthinkable-lap-0201/IdeaProjects/HibernatePractice/src/main/java/hibernate.cfg.xml")).buildSessionFactory();
        Session st = sessionFactory.openSession();
        Student st1 = st.get(Student.class , 1);
        System.out.println(st1);
        sessionFactory.close();
    }
}
