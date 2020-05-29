package com.employee.controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonAlias;

@RestController
@RequestMapping(value = "/employee")
public class EmployeeController<integer> {
	
	@Autowired EmployeeServices e_service;
	
	// Test1
	 @GetMapping(path = "/hello") 
	 public String hello() { 
		 return "Hello world";
	 }
	
	 // Test2
	@RequestMapping(path = "/employeelist")
	public String helloworld()
	{
		return "Hello world";
		
	}
	
	// get the entire list 
	@GetMapping(path = "/fulllist")
	public Iterable<Employeetable>  employeelist(){
		return e_service.findAll();
	}
	
	// get by id
	@GetMapping(path="/details/{E_id}")
	public String getById(@PathVariable int E_id){
		Employeetable obj = e_service.findbyId(E_id);
		return (
				"E_id:"     +obj.getE_id() 
				+ "\n E_FName:"  +obj.getE_first_name()
				+ "\n E_LName:"  +obj.getE_last_name()
				+ "\n E_salary:" +obj.getE_salary()
				+ "\n E_phone:"  +obj.getE_phone()
				);
	}
	
	// Save new record
	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void newEntry(@RequestBody Employeetable Employeetable) {
		
		
		e_service.save(Employeetable);
		
//		Employeetable obj= e_service.save(Employeetable);
		
		// Employeetable obj= e_service.findbyId(n);
		
//		return (
//				"E_id:"     +obj.getE_id() 
//				+ "\n E_FName:"  +obj.getE_first_name()
//				+ "\n E_LName:"  +obj.getE_last_name()
//				+ "\n E_salary:" +obj.getE_salary()
//				+ "\n E_phone:"  +obj.getE_phone()
//				);
			}
	
}
