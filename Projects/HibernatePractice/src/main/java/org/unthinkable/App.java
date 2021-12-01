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

        Student st = new Student(20881107,"testing","Rajasthan");
        System.out.println(st);

        Address ad = new Address();
        ad.setOpen(true);
        ad.setId(12);
        ad.setStreet("kuchbhi");
        ad.setCity("kanpur");
        ad.setX(90.90);
        System.out.println(ad);
        Session sess = sessionFactory.openSession();
        sess.beginTransaction();
        sess.save(st);
        sess.save(ad);
        sess.getTransaction().commit();
        sess.close();



    }
}
