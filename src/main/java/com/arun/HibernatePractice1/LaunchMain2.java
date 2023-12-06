package com.arun.HibernatePractice1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.arun.entity.Student;

public class LaunchMain2 
{
	public static void main(String[] args) 
	{
		
		Configuration config=new Configuration();
		
        config.configure();
        
        SessionFactory sf=config.buildSessionFactory();
        
        Session session=sf.openSession();
        
        Transaction tx=session.beginTransaction();
        
        Student std=new Student();
        std.setMarks(50);
        std.setRoll(507);
        std.setName("Aditya");
        
        session.delete(std);
        
        tx.commit();
        
        session.close();
        
        
        

	}

}
