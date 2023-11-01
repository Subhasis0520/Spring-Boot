package com.org.bean;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {

	private int studentId;
	private String studentName;
	private String gender;
	private long phone;
	private Date dob;
}
