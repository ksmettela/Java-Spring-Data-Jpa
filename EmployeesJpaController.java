package com.project.AssignmentJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
public class EmployeesJpaController {
    @Autowired
    private EmployeesJpaService employeesJpaService;

    @RequestMapping("/EmployeesJpa")
    public List<EmployeesJpa> getAllEmployeesJpa(){
        return employeesJpaService.getAllEmployeesJpa();
    }

    @RequestMapping("/EmployeesJpa/{Id}")
    public Optional<EmployeesJpa> getAllEmployeesJpaById(@PathVariable String id){
        return employeesJpaService.getEmployeesJpaById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value="/EmployeesJpa")
    public void addEmployeesJpa(@RequestBody EmployeesJpa employeesJpa){
        employeesJpaService.addEmployeesJpa(employeesJpa);
    }

    @RequestMapping(method = RequestMethod.PUT, value="/EmployeesJpa/{id}")
    public void updateEmployeesJpa(@RequestBody EmployeesJpa employeesJpa,@PathVariable String id){
        employeesJpaService.updateEmployeesJpa(employeesJpa,id);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/EmployeesJpa/{id}")
    public void deleteEmployeesJpa(@PathVariable String id,EmployeesJpa employeesJpa){
        employeesJpaService.deleteEmployeesJpa(id,employeesJpa);
    }
}
