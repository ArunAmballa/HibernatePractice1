package com.arun.HibernatePractice1;

import java.io.IOException;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arun.entity.Student;

public class LaunchMain 
{
	public static void main(String args[]) throws IOException
	{
		Configuration config=new Configuration();
		
        config.configure();
        
        SessionFactory sf=config.buildSessionFactory();
        
        Session session=sf.openSession();
        
        Student std1=session.load(Student.class, 504);
        
        System.out.println(std1.getRoll());
        
        System.in.read();
        
        System.out.println(std1);
        
	}
}
