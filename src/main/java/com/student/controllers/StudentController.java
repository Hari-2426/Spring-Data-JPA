package com.student.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


import com.student.dao.StudentDao;
import com.student.services.StudentServices;

@RestController
public class StudentController {
	
	
	@Autowired
	StudentServices ss;
	
	@GetMapping("/insert")
	public String insertData()
	{
		String insertStudentData = ss.insertStudentData();
		return insertStudentData;
		
	}
	
	@GetMapping("/get")
	public List<StudentDao> getData()
	{
		return ss.getStudentData();
	}
	
	@GetMapping("/byId")
	public StudentDao getDataById()
	{
		return ss.getStudentById();
	}
	
	@GetMapping("/update")
	public String updateData()
	{
		return ss.updateStudentData();
	}
	@GetMapping("/delete")
	public String deleteData()
	{
		return ss.deleteStudentData();
	}

}
