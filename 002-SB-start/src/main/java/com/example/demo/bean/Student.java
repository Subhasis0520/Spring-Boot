package com.example.demo.bean;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Student {

	private int sid;
	private String sname;
	private String gender;
	private double result;
	
}
