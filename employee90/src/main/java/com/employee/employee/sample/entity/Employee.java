package com.employee.employee.sample.entity;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="employeez")
public class Employee implements Serializable{

     private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY )
    @Column(name = "id")
    private int id;

    private String name;
    private int salary;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}
