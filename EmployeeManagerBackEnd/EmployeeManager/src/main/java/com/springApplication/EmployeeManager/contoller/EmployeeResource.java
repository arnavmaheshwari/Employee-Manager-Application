package com.springApplication.EmployeeManager.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springApplication.EmployeeManager.model.*;
import com.springApplication.EmployeeManager.service.EmployeeService;

import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;



// Controller is used to define the methods that call the services in the EmployeeService Class

@RestController
@RequestMapping("/employee")
@CrossOrigin("*")
public class EmployeeResource {
    private final EmployeeService employeeService;

    public EmployeeResource(EmployeeService employeeService){
        this.employeeService = employeeService;
    }

    // To get all Employees
    @GetMapping("/all")
    // To return an HTTP response, we use a generic ResponseEntity. In the body of the HTTP response, we get a List of 'Employees'
    public ResponseEntity<List<Employee>> getAllEmployees(){
        // Call the service and store the result in a list
        List<Employee> employees = employeeService.findAllEmployees();
        return new ResponseEntity<>(employees, HttpStatus.OK);
    }

    //  Get an employee using their ID
    @GetMapping("/find/{id}")
    // @PathVairiable uses the value from the URL
    public ResponseEntity<Employee> getEmployeeById(@PathVariable("id") Long id){
        // Call the service and store the result in a object of class Employee
        Employee employee = employeeService.findEmployeeById(id);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    // Add an employee
    @PostMapping("/add")
    // @RequestBody converts the data from the body of HTTP request into java object of class Employee
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        Employee newEmployee = employeeService.addEmployee(employee);
        return new ResponseEntity<>(newEmployee,HttpStatus.CREATED);
    }

    // Update an employee
    @PutMapping("/update")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        Employee updateEmployee = employeeService.updateEmployee(employee);
        return new ResponseEntity<>(updateEmployee, HttpStatus.OK);
    }

    // Delete an employee by Id
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
