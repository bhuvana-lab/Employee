package com.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServices {

	@Autowired
	EServiceFunc e_service;

	public Iterable<Employeetable> findAll() {
		return e_service.findAll();

	}

	public Employeetable findbyId(int E_id) {
		return e_service.findById(E_id);
	}

	public int save(Employeetable employeetable) {
		return e_service.save(employeetable.getE_id(), employeetable.getE_first_name(), employeetable.getE_last_name(),
				employeetable.getE_salary(), employeetable.getE_phone());
	}

	public int update(int E_id, Employeetable E_phone) {

		return e_service.updateById(E_id, E_phone.getE_phone());

	}

	public int delete(int E_id) {
		return e_service.deleteById(E_id);

	}

}
