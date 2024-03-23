// Works as a Data Access layer for interaction with database
// Provides us pre-defined methods to perform CRUD operations with the database
package com.springApplication.EmployeeManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.springApplication.EmployeeManager.model.Employee;

// Extends the <JAVA main class, Type of Primary Key>
public  interface EmployeeRepository extends JpaRepository<Employee, Long> {}

// To see all the methods (like findAll, getOne, saveAll, etc.), CTRL+click the JpaRepository keyword above