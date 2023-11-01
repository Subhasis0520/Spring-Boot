package com.org.test;

import com.org.bean.Student;

public class Test {

	public static void main(String[] args) {
		
		Student s = new Student();
		s.setGender("male");
		s.setStudentId(101);
		s.setStudentName("Virat");
		
		System.out.println(s);
	}
}
