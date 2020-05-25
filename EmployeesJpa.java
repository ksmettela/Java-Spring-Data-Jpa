package com.project.AssignmentJpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeesJpa {
    @Id
    private String empId;
    private String name;
    private String DOB;
    private String salary;
    private String location;
    private String married;
    public EmployeesJpa(){
    }
    public EmployeesJpa(String empId, String name, String DOB, String salary, String location, String married) {
        super();
        this.empId = empId;
        this.name = name;
        this.DOB = DOB;
        this.salary = salary;
        this.location = location;
        this.married = married;
    }
    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married;
    }
}


