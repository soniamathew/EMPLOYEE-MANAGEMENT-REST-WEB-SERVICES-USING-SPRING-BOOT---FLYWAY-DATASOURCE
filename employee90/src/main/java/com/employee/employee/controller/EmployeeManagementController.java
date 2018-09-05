package com.employee.employee.controller;
import com.employee.employee.sample.entity.Employee;
import com.employee.employee.service.EmployeeManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpHeaders;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/api")
public class EmployeeManagementController {
    @Autowired
    private EmployeeManagementService employeeManagementService;


  //create employee :
    @RequestMapping(value="/create", method = RequestMethod.POST)
    public ResponseEntity<String> getEmployee(@RequestBody Employee employee,UriComponentsBuilder builder) {
        createEmployee(employee);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/update").buildAndExpand(employee).toUri());
        return new ResponseEntity<String>("success", HttpStatus.CREATED);
    }
     public boolean createEmployee(Employee employee)
     {
      employeeManagementService.createEmployee(employee);
       return false;
     }


   //read the employee by id :
  @RequestMapping(value = "/read/{id}", method = RequestMethod.GET)
   public ResponseEntity<Employee> findEmployee(@PathVariable("id") Integer id,UriComponentsBuilder builder)
    {
      Employee e = readEmployeebyId(id);
      System.out.println();
       HttpHeaders headers = new HttpHeaders();
       headers.setLocation(builder.path("/delete/{id}").buildAndExpand(id).toUri());
       return new ResponseEntity<Employee>(e, HttpStatus.OK);
    }
    public Employee readEmployeebyId(int id)
    {
       Employee e = employeeManagementService.readEmployeeById(id);
      return e;
    }


    //update the employee details :
    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public  ResponseEntity<Employee> changeEmployee(@RequestBody Employee employee, UriComponentsBuilder builder)
    {
        updateEmployee(employee);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/update").buildAndExpand(employee).toUri());
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }
    public  void updateEmployee(Employee employee)
   {
        employeeManagementService.updateEmployee(employee);
    }


   //delete employee by id :
    @RequestMapping(value = "/delete/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<String> deleteEmployeebyId(@PathVariable("id") Integer id,UriComponentsBuilder builder)
    {
        deleteEmployee(id);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/delete/{id}").buildAndExpand(id).toUri());
        return new ResponseEntity<String>("deleted", HttpStatus.OK);
    }
    public void deleteEmployee(int id)
   {
        employeeManagementService.deleteEmployee(id);
    }

}
