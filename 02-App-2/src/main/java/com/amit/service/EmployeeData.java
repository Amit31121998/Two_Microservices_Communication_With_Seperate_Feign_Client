package com.amit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amit.binding.Employee;
import com.amit.feign.EmployeeFeign;

@Service
public class EmployeeData {

	@Autowired
	private EmployeeFeign empFeign;

	public Employee getdata(Integer id) {
		Employee employee = empFeign.getData(id);

		return employee;
	}

}
