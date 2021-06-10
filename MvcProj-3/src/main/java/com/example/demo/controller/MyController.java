package com.example.demo.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MyController {
	@RequestMapping (value="/emp",method=RequestMethod.GET)
	public String showView() {
		return"index";
	}

	public MyController() {
		System.out.println("obj created");
		
		// TODO Auto-generated constructor stub
	}
	@PostConstruct
	public void show() {
		System.out.println("init method called");
	}
	@PreDestroy
	public void show2() {
		System.out.println("destroy method called");
	}

}
