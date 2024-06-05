package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RESTServices {
	
	@RequestMapping("/get")
	public String doGet() {
		return "Hello Guys, Welcome to Spring Boot";
	}
	
	@RequestMapping("/post")
	public String doPost() {
		return "Hello Guys, Welcome to Post Method";
	}
	
	
}
