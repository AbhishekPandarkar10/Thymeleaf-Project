package com.practice.controller;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ThymeleafController {
	
	@RequestMapping(value = "/home",method = RequestMethod.GET)
	public String home(Model model) {
		System.out.println("method");
		
		model.addAttribute("name","Abhishek");
		model.addAttribute("currentDate",new Date());
		
		return "home";
	}
	
	@GetMapping("/iterate")
	public String looping(Model m) {
		
		List<String> names= List.of("abhi","rishi","keshav","sanket");
		m.addAttribute("names",names);
		return "iterate";
	}
	
	//conditional Statement are 1. if,unless 2. switch 3.Elvis	
	// fragments 1.th:replace 2. th:insert 3. th:include
	//Inheriting Thymeleaf Templare | This thing used in project | Spring boot
	//Server side validation in spring MVC using tymeleaf

}
