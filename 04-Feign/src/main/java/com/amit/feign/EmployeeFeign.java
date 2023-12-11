package com.amit.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.amit.binding.Employee;

@FeignClient(name = "API-1")
public interface EmployeeFeign {
	
	@GetMapping("/getData/{id}")
	public Employee getData(@PathVariable Integer id);
}