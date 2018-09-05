package com.employee.employee.service;

import com.employee.employee.sample.entity.Employee;

public interface IEmployeeManagementService {

    public void createEmployee(Employee employee);

    public Employee readEmployeeById(int id);

    public  void updateEmployee(Employee employee);

    public void deleteEmployee(int id);
}
