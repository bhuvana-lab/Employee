package com.employee.controller;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface EServiceFunc extends CrudRepository<Employeetable, Long>{
	@Query(value="SELECT * FROM employer_personal_details WHERE E_id= :E_id ",nativeQuery =true)
	Employeetable findById(int E_id);
	
	@Modifying
	@Transactional
	@Query(value = "INSERT INTO employer_personal_details (E_id, E_first_name, E_last_name, E_salary, E_phone) VALUES (:E_id, :E_first_name, :E_last_name, :E_salary, :E_phone)", nativeQuery = true)
	int save(int E_id, String E_first_name, String E_last_name, int E_salary, int E_phone);

}
	
	
