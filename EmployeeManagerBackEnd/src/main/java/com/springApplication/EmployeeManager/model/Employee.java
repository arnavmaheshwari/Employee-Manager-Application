package com.springApplication.EmployeeManager.model;

import java.io.Serializable;

import jakarta.persistence.*;


// Serializable converts the class to  a stream of bytes that can be stored and sent over network/to the database
// We do this because data is sent over from the front-end to the back-end in one format and stored in the databse in another, hence, for easy transfer of data, we convert to byte stream and send
@Entity
public class Employee implements Serializable{
    // We can define the things for each column as follows: -(Here, done only for Id)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //To store Id as the primary key
    @Column(nullable =false,updatable = false) //To make Id as non-null field and non-updatable
    private Long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable =false,updatable = false) //To make employeeCode as non-null field and non-updatable
    private String employeeCode;

    public Employee() {}

    // Constructor with parameters to initialize the class
    public Employee(String name, String email, String jobTitle, String phone, String imageUrl, String employeeCode) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.phone = phone;
        this.imageUrl = imageUrl;
        this.employeeCode = employeeCode;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    // To print all the info. of an object of the class
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", phone='" + phone + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}