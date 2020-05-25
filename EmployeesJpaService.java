package com.project.AssignmentJpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.*;
@Service
public class EmployeesJpaService {
    @Autowired
    private EmployeesJpaRepository ejr;

    public List<EmployeesJpa> getAllEmployeesJpa(){
        return ejr.findAll();
    }
    public void addEmployeesJpa(EmployeesJpa ej){
        ejr.save(ej);
    }
    public Optional<EmployeesJpa> getEmployeesJpaById(String id){
        return ejr.findById(id);
    }
    public void updateEmployeesJpa(EmployeesJpa ej,String id){
        ejr.save(ej);
    }
    public void deleteEmployeesJpa( String id,EmployeesJpa ej){
        ejr.delete(ej);
    }


}
