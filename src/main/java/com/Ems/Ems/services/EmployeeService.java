package com.Ems.Ems.services;

import java.util.List;

import com.Ems.Ems.domains.Employee;


public interface EmployeeService {
	 public List<Employee> getAllemployees();
	 
	 public Employee getEmployeeById(long id);

	 public void saveOrUpdate(Employee employee);

	 public void deleteEmployee(long id);
}


