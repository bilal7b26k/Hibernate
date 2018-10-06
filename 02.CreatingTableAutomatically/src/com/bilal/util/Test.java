package com.bilal.util;

import com.bilal.dao.StudentDao;
import com.bilal.dto.Student;

public class Test {
	public static void main(String[] args) {
		Student stu=new Student();
		stu.setId(1);
		stu.setName("Belal");
		stu.setEmail("belal@gmail.com");
		
		StudentDao s=new StudentDao();
		s.saver(stu);
		
	}

}
