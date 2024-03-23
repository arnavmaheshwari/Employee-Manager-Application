package com.springApplication.EmployeeManager.exception;

// Creating a user defined exception
public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message){
        super(message);
    }
}
