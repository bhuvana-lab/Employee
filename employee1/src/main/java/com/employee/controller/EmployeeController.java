package com.employee.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	
	 @GetMapping(path = "/hello") 
	 public String hello() { 
		 return "Hello world ssss";
	 }
	

	@RequestMapping(path = "/employeelist")
	public String helloworld()
	{
		return "Hello world";
		
	}
	
	@GetMapping(path = "/fulllist",produces = "list.json")
	public Iterable<Employeetable>  employeelist(){
		return null;
		
	}
	
}
