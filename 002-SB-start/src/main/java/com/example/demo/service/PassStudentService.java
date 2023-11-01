package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.bean.Student;

@Service
public class PassStudentService implements StudetService{

	@Override
	public void marksheet(Student s) {
		
		if(s.getResult() > 60.0)
			System.out.println("Mark-sheet issue");
		else 
			System.out.println("Try next time");
	}

	
}
