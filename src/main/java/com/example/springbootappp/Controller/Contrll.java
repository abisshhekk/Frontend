package com.example.springbootappp.Controller;

import com.example.springbootappp.Entity.Employee;
import com.example.springbootappp.Repo.Emprepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/emp")
public class Contrll {
    @Autowired
    Emprepo repo;
    @GetMapping("/eml")
    public List<Employee> datas()
    {
        List<Employee>data=repo.findAll();

        return data;
    }
    @GetMapping("/id/{empid}")
    public Optional<Employee> byid(@PathVariable int empid)
    {
     Optional<Employee>emp=repo.findById(empid);
        return emp;
    }
    @GetMapping("/name/{empname}")
    public List<Employee> byname(@PathVariable String empname)
    {

        List<Employee>data=repo.findByEmpname(empname);

        return data;
        System.out.println("The data is loaded");
    }
    @DeleteMapping("/del/{empid}")
    public String del(@PathVariable int empid)
    {
        repo.deleteById(empid);
        return "delted succ!";
    }
    @PostMapping("/post")
    public String posting(@RequestBody Employee emp)
    {
        if(emp.getEmpid()!=0)
        {
           Employee employee=new Employee();

           employee.setEmpid(emp.getEmpid());
           employee.setEmpname(emp.getEmpname());
           employee.setDep(emp.getDep());
           employee.setSalary(emp.getSalary());

           repo.save(employee);

           return "data saved";


        }
        return "please enetr id";
    }
@PutMapping("/update")
    public String updated(@RequestBody Employee emp)
   {
    if(repo.existsById(emp.getEmpid()))
    {
        Employee employee=new Employee();
        employee.setEmpid(emp.getEmpid());
        employee.setEmpname(emp.getEmpname());
        employee.setDep(emp.getDep());
        employee.setSalary(emp.getSalary());

        repo.save(employee);

        return "data updated";
    }
    return "id not found";
}
}
