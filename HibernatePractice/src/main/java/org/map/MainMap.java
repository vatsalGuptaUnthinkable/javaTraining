package org.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.unthinkable.Address;
import org.unthinkable.Student;

import java.io.File;

public class MainMap {
    public static void main(String args[]){

        System.out.println( "Project Started " );
        SessionFactory sessionFactory = new Configuration().configure(new File("/home/unthinkable-lap-0201/IdeaProjects/HibernatePractice/src/main/java/hibernate.cfg.xml")).buildSessionFactory();

        Answer ans1 = new Answer();
        ans1.setaId(1);
        ans1.setAnswers("My Name is Vatsal");

        Question qs = new Question();
        qs.setAnswer(ans1);
        qs.setQuestion("What is yor name");
        qs.setqId(1);
        Session sess = sessionFactory.openSession();
        Transaction tx = sess.beginTransaction();
        sess.save(ans1);
        sess.save(qs);
        tx.commit();
        sess.close();


    }
}
