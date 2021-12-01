package org.unthinkable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class emDemo {
    public static void main(String args[]){
        System.out.println( "Project Started " );
        SessionFactory sessionFactory = new Configuration().configure(new File("/home/unthinkable-lap-0201/IdeaProjects/HibernatePractice/src/main/java/hibernate.cfg.xml")).buildSessionFactory();
        Session st = sessionFactory.openSession();
        newStudent nt = new newStudent();
        nt.setId(1);
        nt.setName("test");

        Certificate ct = new Certificate();
        ct.setCertiName("test");
        ct.setOrgan("organ");
        nt.setCertificate(ct);
        st.save(nt);

        sessionFactory.close();
    }
}
