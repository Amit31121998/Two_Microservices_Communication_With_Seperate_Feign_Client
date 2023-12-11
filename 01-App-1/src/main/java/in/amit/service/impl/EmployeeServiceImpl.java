package in.amit.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.amit.entity.Employee;
import in.amit.repo.EmployeeRepo;
import in.amit.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepo eRepo;
	
	@Override
	public boolean saveEmployee(Employee emp) {
		eRepo.save(emp);
		return true;
	}

	@Override
	public Employee getData(Integer id) {
		Optional<Employee> findById = eRepo.findById(id);
		return findById.get();
	}

}
