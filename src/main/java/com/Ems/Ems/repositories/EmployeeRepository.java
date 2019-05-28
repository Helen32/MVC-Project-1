package com.Ems.Ems.repositories;

import org.springframework.data.repository.CrudRepository;

import com.Ems.Ems.domains.Employee;


public interface EmployeeRepository  extends CrudRepository<Employee, Long>{

}
