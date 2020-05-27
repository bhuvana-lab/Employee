package com.employee.controller;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EServiceFunc extends CrudRepository<Employeetable, Long>{
	/*
	 * @Query(value="SELECT * FROM employee_personal_details WHERE name= :name ",
	 * nativeQuery =true) public Iterable<Employeetable> findall();
	 */}
	
