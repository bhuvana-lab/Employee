package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/employee")
@CrossOrigin(origins="*")
public class EmployeeController<integer> {

	@Autowired
	EmployeeServices e_service;

	// Test1
	@GetMapping(path = "/hello")
	public String hello() {
		return "Hello world";
	}

	// Test2
	@RequestMapping(path = "/employeelist")
	public String helloworld() {
		return "Hello world";

	}

	// Get the entire employee list
	@GetMapping(path = "/fulllist")
	public Iterable<Employeetable> employeelist() {
		return e_service.findAll();
	}

	// get the employee details by id
	@GetMapping(path = "/details/{E_id}")
	public String getById(@PathVariable int E_id) {
		Employeetable obj = e_service.findbyId(E_id);
		return ("E_id:" + obj.getE_id() + "\n E_FName:" + obj.getE_first_name() + "\n E_LName:" + obj.getE_last_name()
				+ "\n E_salary:" + obj.getE_salary() + "\n E_phone:" + obj.getE_phone());
	}

	// Save new employee record
	@PostMapping(path = "/new", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String newEntry(@RequestBody Employeetable Employeetable) {

		e_service.save(Employeetable);
		return "Json inserted";
	}
	
	// update by id
	@PutMapping(path = "/update/{E_id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public String updateEntry(@PathVariable int E_id, @RequestBody Employeetable E_phone) {
		
		e_service.update(E_id,E_phone);
		Employeetable obj = e_service.findbyId(E_id);
		return ("E_id:" + obj.getE_id() + "\n E_FName:" + obj.getE_first_name() + "\n E_LName:" + obj.getE_last_name()
				+ "\n E_salary:" + obj.getE_salary() + "\n E_phone:" + obj.getE_phone());
	}

	// deleting an employee details by id
	@DeleteMapping(path = "/del/{E_id}")
	public String delEntry(@PathVariable int E_id) {
		e_service.delete(E_id);
		return "item deleted";
	}
 
}
