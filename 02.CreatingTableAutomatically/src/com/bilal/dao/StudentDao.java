package com.bilal.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bilal.dto.Student;

public class StudentDao {
	public void saver(Student stu) {
		SessionFactory sf=new Configuration().configure().addAnnotatedClass(Student.class).buildSessionFactory();
		Session s=sf.openSession();
		s.save(stu);
		System.out.println("Data Saved !!");
		s.beginTransaction().commit();
		System.out.println("Data pushed in the DB !!");
		s.close();
		sf.close();
		System.out.println("All costly resource closed !!");
		
		
	}
}
