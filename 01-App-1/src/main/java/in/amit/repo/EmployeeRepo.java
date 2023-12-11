package in.amit.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.amit.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
