package com.employee.employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import java.io.*;
@SpringBootApplication
@EntityScan(basePackages = {"com.employee.employee.*"})

public class EmployeeApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(EmployeeApplication.class, args);
        System.out.println("\n \n \n ------- EMPLOYEE MANAGEMENT RESTFUL WEB SERVCIE USING SPRING BOOT AND HIBERANTE  ------\n");

    }
}
