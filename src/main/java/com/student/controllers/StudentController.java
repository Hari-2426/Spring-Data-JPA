package com.student.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.student.services.StudentServices;

@RestController
public class StudentController {
	
	
	@Autowired
	StudentServices ss;
	@GetMapping("/savedata")
	public String saveData()
	{
		String saveStudentData = ss.saveStudentData();
		return saveStudentData;
	}

}
