package com.student.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.student.dao.StudentDao;
import com.student.dao.StudentRepository;

@Service
public class StudentServices {
	
	@Autowired
	StudentRepository sp;
	
	public String insertStudentData()
	{
		StudentDao s4 = new StudentDao(104,"Anjali",93,"IT");
		StudentDao s5 = new StudentDao(105,"Rahul",76,"MECH");
		StudentDao s6 = new StudentDao(106,"Sneha",89,"EEE");
		StudentDao s7 = new StudentDao(107,"Varun",84,"CIVIL");
		StudentDao s8 = new StudentDao(108,"Pooja",97,"AI");
		StudentDao s9 = new StudentDao(109,"Teja",81,"DS");
		StudentDao s10 = new StudentDao(110,"Nikhil",90,"CSBS");
        ArrayList<StudentDao> al=new ArrayList<>( Arrays.asList(s4,s5,s6,s7,s8,s9,s10));
		sp.saveAll(al);
		return "Multiple Records Inserted";
	}
	
	public List<StudentDao> getStudentData()
	{
		List<StudentDao> all = sp.findAll();
		return all;
	}
	
	public StudentDao getStudentById()
	{
		Optional<StudentDao> byId = sp.findById(20);
		return byId.orElse(null);
		
	}
	
	public String updateStudentData()
	{
		StudentDao st = sp.findById(21).orElse(null);
		st.setStudentName("Hari Hara");
		sp.save(st);
		return "Data Updated Successfully!!!";
	}
	
	public String deleteStudentData()
	{
		StudentDao student = sp.findById(22).orElse(null);
		sp.delete(student);
		return "Duplicate Name Found So Data Deleted Successfully!!!";
		
	}


}
