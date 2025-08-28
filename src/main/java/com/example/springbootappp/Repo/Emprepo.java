package com.example.springbootappp.Repo;

import com.example.springbootappp.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface Emprepo extends JpaRepository<Employee,Integer> {

    List<Employee> findByEmpname(String empname);
}
