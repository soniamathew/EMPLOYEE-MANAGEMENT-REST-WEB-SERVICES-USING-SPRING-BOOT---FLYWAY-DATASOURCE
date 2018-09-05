package com.employee.employee.sample.dao;

import com.employee.employee.sample.entity.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeDaoInterface extends CrudRepository<Employee, Integer>{

}

