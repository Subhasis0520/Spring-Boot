package com.org.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.binding.Student;
import com.org.entity.StudentEntity;
import com.org.repository.StudentDao;

@Service
public class StudentService {

	@Autowired
	private StudentDao dao;
	
	
	public List<String> getCourses(){
		return List.of("Java","Python","Spring","Devops");
	}
	
	public List<String> getTimings(){
		return List.of("Morning","AfterNoon","Evening");
	}
	
	public boolean saveStudent(Student student) {
		StudentEntity entity = new StudentEntity();
		
		BeanUtils.copyProperties(student, entity);		
		entity.setTimings(Arrays.toString(student.getTimings()));
		
		dao.save(entity);
		return true;
	}
}
