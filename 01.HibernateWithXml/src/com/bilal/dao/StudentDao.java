package com.bilal.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bilal.dto.StudentDto;

public class StudentDao {

	public void saver(StudentDto s) {
		SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StudentDto.class).buildSessionFactory();
		Session session=sf.openSession();
		session.save(s);
		session.beginTransaction().commit();
		session.close();
		sf.close();
		
		
		
	}

}
