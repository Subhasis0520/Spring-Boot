package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.example.demo.service.StudetService;

@Repository
public class StudentDao {

	@Autowired
	private StudetService service;
	
	
	public StudentDao() {
		System.out.println("StudentDao :: Constructor");
	}
	
	
}
