package in.amit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.amit.entity.Employee;
import in.amit.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService eService;
	
	@PostMapping("/save")
	public String saveEmp(@RequestBody Employee emp) {
		
		boolean status = eService.saveEmployee(emp);
		
		if(status) {
			return "success";
		}else {
			return "Failure";
		}
	}
	@GetMapping("/getData/{id}")
	public Employee getData(@PathVariable Integer id) {
		return eService.getData(id);
	}
}