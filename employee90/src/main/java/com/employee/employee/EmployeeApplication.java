package com.employee.employee;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import java.io.*;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.employee.employee.*"})
@EntityScan(basePackages = {"com.employee.employee.*"})

public class EmployeeApplication {

    public static void main(String[] args) throws IOException {

        SpringApplication.run(EmployeeApplication.class, args);
        System.out.println("\n \n \n ------- EMPLOYEE MANAGEMENT RESTFUL WEB SERVCIE USING SPRING BOOT AND HIBERANTE  ------\n");

    }
}
