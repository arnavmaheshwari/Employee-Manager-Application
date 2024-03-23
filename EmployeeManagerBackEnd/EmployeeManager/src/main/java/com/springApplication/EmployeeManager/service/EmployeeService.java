package com.springApplication.EmployeeManager.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springApplication.EmployeeManager.exception.UserNotFoundException;
import com.springApplication.EmployeeManager.model.*;
import com.springApplication.EmployeeManager.repository.*;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeService {

    private final EmployeeRepository EmployeeRepo;

    // To use the Repository in this EmployeeService class: -
    // @Autowired allows automatic dependency injection for Java class, without manually doing it.

    @Autowired
    public EmployeeService(EmployeeRepository EmployeeRepo) {
        this.EmployeeRepo = EmployeeRepo;
    }

    // Defining the method to add a Employee
    public Employee addEmployee(Employee employee){
        // Setting Random EmployeeCode
        employee.setEmployeeCode(UUID.randomUUID().toString());
        // This save function is given by the JpaRepository
        return EmployeeRepo.save(employee);
    }

    // Getting all Employees from the database
    public List<Employee> findAllEmployees(){
        return EmployeeRepo.findAll();
    }

    // Update Employee information
    public Employee updateEmployee(Employee employee){
        return EmployeeRepo.save(employee);
    }

    // Get Employee by id
    public Employee findEmployeeById(Long id){
        return EmployeeRepo.findById(id).orElseThrow(()-> new UserNotFoundException ("User by id "+id+"was not found"));
        // This is calling a user defined exception
    }

    // Delete Employee
    public void deleteEmployee(Long id){
         EmployeeRepo.deleteById(id);
    }

}
