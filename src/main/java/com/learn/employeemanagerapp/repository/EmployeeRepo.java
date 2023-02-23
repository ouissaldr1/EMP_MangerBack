package com.learn.employeemanagerapp.repository;

import com.learn.employeemanagerapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
    void deleteEmployeeById(int id);

    Optional<Employee> findEmployeeById(int id);
}
