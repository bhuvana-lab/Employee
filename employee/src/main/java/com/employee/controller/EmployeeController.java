package com.employee.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
	
	
	 @GetMapping(path = "/hello") 
	 public String hello() { 
		 return "Hello world";
	 }
	

	@RequestMapping(path = "/employeelist")
	public String employeelist()
	{
		return "Hello world";
		
	}
	
}
