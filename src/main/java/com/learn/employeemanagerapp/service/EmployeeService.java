package com.learn.employeemanagerapp.service;

import com.learn.employeemanagerapp.exception.UserNotFoundException;
import com.learn.employeemanagerapp.model.Employee;
import com.learn.employeemanagerapp.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    public Employee addEmploye(Employee employee){
        employee.setEmployeCode(UUID.randomUUID().toString());
        return employeeRepo.save(employee);
    }

    public List<Employee> findAllEmployees(){
        return employeeRepo.findAll();
    }

    public Employee findEmployeeById(int id){

        return  employeeRepo.findEmployeeById(id).orElseThrow(()->
                new UserNotFoundException("User with id "+id+" not Found"));
    }
    public Employee updateEmploye(Employee employee){
        return employeeRepo.save(employee);
    }

    public void deleteEmployee(int id){
         employeeRepo.deleteEmployeeById(id);
    }
}
