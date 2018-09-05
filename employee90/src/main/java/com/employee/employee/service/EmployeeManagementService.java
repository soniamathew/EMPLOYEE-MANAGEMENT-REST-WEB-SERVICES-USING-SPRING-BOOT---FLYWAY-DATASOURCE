package com.employee.employee.service;
import com.employee.employee.sample.dao.EmployeeDaoInterface;
import com.employee.employee.sample.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class EmployeeManagementService implements IEmployeeManagementService {

    @Autowired
    private EmployeeDaoInterface employeeDaoInterface;

    //create
    @Override
    public void createEmployee(Employee employee) {
    employeeDaoInterface.save(employee);
    System.out.println("\nEmployee : " + employee + " was created successfully");
     }



        //read by id
        @Override public Employee readEmployeeById ( int id)
        {
            Employee employee = employeeDaoInterface.findById(id).get();
            System.out.println("\nEmployee : " + employee + " was read successfully");
            return employee;
        }


        //update
        @Override public void updateEmployee (Employee employee)
        {
            if (employeeDaoInterface.existsById(employee.getId())) {
                employeeDaoInterface.save(employee);
                System.out.println("\nEmployee : " + employee + " was updated successfully");

            } else {
                System.out.println("\nEmployee with id : " + employee.getId() + " doesn't exist in the table' ");
            }
        }


        //delete
        @Override public void deleteEmployee ( int id)
        {
            Employee employee = employeeDaoInterface.findById(id).get();
            employeeDaoInterface.deleteById(id);
            System.out.println("\nEmployee :  " + employee + " was deleted successfully");
        }

    }



