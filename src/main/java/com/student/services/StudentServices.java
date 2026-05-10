package com.student.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.dao.StudentDao;
import com.student.dao.StudentRepository;

@Service
public class StudentServices {
	
	@Autowired
	StudentRepository sr;
	
	public String saveStudentData()
	{
		StudentDao sd1=new StudentDao(100,"Nandan","B.Tech",98);
		sr.save(sd1);
		return sd1.getSname();
	}

}
