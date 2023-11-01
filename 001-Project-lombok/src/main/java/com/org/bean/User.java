package com.org.bean;

import java.util.Date;

import lombok.Data;

@Data
public class User {

	private int uid;
	private String name;
	private String gender;
	private long phone;
	private Date joinDate;
}
