package in.amit.service;

import in.amit.entity.Employee;

public interface EmployeeService {

	public boolean saveEmployee(Employee emp);
	
	public Employee getData(Integer id);
}
