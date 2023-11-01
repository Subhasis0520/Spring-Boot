package com.org.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.org.binding.Student;
import com.org.service.StudentService;

@Controller
public class MyController {

	@Autowired
	private StudentService service;
	
	@GetMapping("/")
	public String getIndexPage(Model model) {
		init(model);		
		return "index";
	}

	private void init(Model model) {
		model.addAttribute("student", new Student());
		model.addAttribute("courses" , service.getCourses());
		model.addAttribute("preTimings", service.getTimings());
	}
	
	@PostMapping("/save")
	public String submitStudentData(Student s , Model model) {
		System.out.println(s);
		boolean saveStudent = service.saveStudent(s);
		
		if(saveStudent)
		model.addAttribute("msg","data saved...!");
		else
			model.addAttribute("msg","data is not saved...!");
		
		init(model);
		return "index";
	}
}
