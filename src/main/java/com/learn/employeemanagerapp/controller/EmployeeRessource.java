package com.learn.employeemanagerapp.controller;

import com.learn.employeemanagerapp.model.Employee;
import com.learn.employeemanagerapp.service.EmployeeService;
import jdk.jshell.Snippet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("/employees")
@CrossOrigin("*")
public class EmployeeRessource {

    @Autowired
    private final EmployeeService employeeService;

    public EmployeeRessource(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping("/all")
    public ResponseEntity<List<Employee>> getAllEmployees(){
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
        }

    /*@GetMapping("/all")
    public String  getAllEmployees(){
        List<Employee> employees = employeeService.findAllEmployees();
        return  "<h1>"+employees+"</h1>";
    }*/


    @GetMapping("/find/{id}")
    public ResponseEntity<Employee> getEmployeById(@PathVariable("id") int id){
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
      return new ResponseEntity<Employee>(employeeService.addEmploye(employee),HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmploye(@RequestBody Employee employee){
        Employee updated = employeeService.updateEmploye(employee);
         return new ResponseEntity<>(updated,HttpStatus.OK);

    }

    @DeleteMapping("/delete/{id}")

    public ResponseEntity<?> deleteEmploye(@PathVariable("id") int id){
        employeeService.deleteEmployee(id);
        return  new ResponseEntity<>(HttpStatus.OK);

    }

}
