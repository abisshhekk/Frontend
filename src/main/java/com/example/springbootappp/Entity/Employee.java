package com.example.springbootappp.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Employee {
    @Id
    private int empid;
    private String empname;
    private double salary;
    private String dep;

}
