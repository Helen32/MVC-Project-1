package com.Ems.Ems.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Ems.Ems.domains.Employee;
import com.Ems.Ems.repositories.EmployeeRepository;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
@Autowired	
EmployeeRepository employeeRepository;
@Override
public List<Employee> getAllemployees() {
	
	return (List<Employee>) employeeRepository.findAll();
}
@Override
public Employee getEmployeeById(long id) {
	
	return employeeRepository.findById(id).get();
}

@Override
public void saveOrUpdate(Employee employee) {
	employeeRepository.save(employee);
	
	
}
@Override
public void deleteEmployee(long id) {
	employeeRepository.deleteById(id);
}


}
