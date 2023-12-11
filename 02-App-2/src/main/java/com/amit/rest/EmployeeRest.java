package com.amit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.amit.binding.Employee;
import com.amit.service.EmployeeData;

@RestController
public class EmployeeRest {

	@Autowired
	private EmployeeData data;
	
	@GetMapping("/getData/{id}")
	public Employee getEmp(@PathVariable Integer id) {
		return  data.getdata(id);
	}
}
