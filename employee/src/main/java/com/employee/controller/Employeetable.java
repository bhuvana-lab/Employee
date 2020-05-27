package com.employee.controller;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employeetable")

public class Employeetable {
@Id	
// @GeneratedValue(strategy = GenerationType.AUTO)
private int E_id;
private String E_first_name;
private String E_last_name;
private int E_salary;
private int E_phone;
public int getE_id() {
	return E_id;
}
public void setE_id(int e_id) {
	E_id = e_id;
}
public String getE_first_name() {
	return E_first_name;
}
public void setE_first_name(String e_first_name) {
	E_first_name = e_first_name;
}
public String getE_last_name() {
	return E_last_name;
}
public void setE_last_name(String e_last_name) {
	E_last_name = e_last_name;
}
public int getE_salary() {
	return E_salary;
}
public void setE_salary(int e_salary) {
	E_salary = e_salary;
}
public int getE_phone() {
	return E_phone;
}
public void setE_phone(int e_phone) {
	E_phone = e_phone;
}

@Override
public String toString() {
	return "Employeetable [E_id=" + E_id + ", E_first_name=" + E_first_name + ", E_last_name=" + E_last_name
			+ ", E_salary=" + E_salary + ", E_phone=" + E_phone + "]";
}


}
