package com.arun.HibernatePractice1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.arun.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration config=new Configuration();
        config.configure();
        
        SessionFactory sf=config.buildSessionFactory();
        
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        
        Student s1=new Student();
        s1.setName("Sai");
        s1.setRoll(506);
        s1.setMarks(98);
        
        session.save(s1);
        
        tx.commit();
        
        session.close();
        
        
        
        
        
    }
}
