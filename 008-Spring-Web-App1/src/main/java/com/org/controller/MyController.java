package com.org.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@GetMapping("/welcome")
	public ModelAndView getMsg() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Welcome to Spring WEB MVC page...!");
		mav.setViewName("message");
		return mav;
	}
	
	@GetMapping("/greet")
	public ModelAndView getGreet() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg","Good Night...!");
		mav.setViewName("message");
		return mav;
	}
}
