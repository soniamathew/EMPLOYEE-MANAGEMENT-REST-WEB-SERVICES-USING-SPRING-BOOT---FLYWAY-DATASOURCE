package com.employee.employee.service;

import com.employee.employee.sample.entity.Employee;

public interface IEmployeeManagementService {

     void createEmployee(Employee employee);

     Employee readEmployeeById(int id);

     void updateEmployee(Employee employee);

     void deleteEmployee(int id);
}
