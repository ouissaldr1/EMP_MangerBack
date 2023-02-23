package com.learn.employeemanagerapp.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private int id;
    private String name;
    private String email;

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    private String phone;
    public Employee(){

    }
    public Employee(String name, String email, String jobTitle, String imageURl, String employeCode, String phone) {
        this.name = name;
        this.email = email;
        this.jobTitle = jobTitle;
        this.imageURl = imageURl;
        this.employeCode = employeCode;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setImageURl(String imageURl) {
        this.imageURl = imageURl;
    }

    public void setEmployeCode(String employeCode) {
        this.employeCode = employeCode;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public String getImageURl() {
        return imageURl;
    }

    public String getEmployeCode() {
        return employeCode;
    }

    private String jobTitle;

    private String imageURl;
    @Column(nullable = false, updatable = false)
    private String employeCode;


    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", imageURl='" + imageURl + '\'' +
                ", employeCode='" + employeCode + '\'' +
                '}';
    }

}
