package com.bilal.util;

import com.bilal.dao.StudentDao;
import com.bilal.dto.StudentDto;

public class Test {
	public static void main(String[] args) {
		StudentDto s=new StudentDto();
		s.setId("1");
		s.setName("belal");
		s.setEmail("belal@gmail.com");
		StudentDao sd=new StudentDao();
		sd.saver(s);
		
		
	}

}
