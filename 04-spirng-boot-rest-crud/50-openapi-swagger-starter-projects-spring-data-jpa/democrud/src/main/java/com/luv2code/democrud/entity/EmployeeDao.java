package com.luv2code.democrud.entity;

import java.util.List;

public interface EmployeeDao {
    // returns a list of employees
    List<Employee> findAll();
    //find by id
    Employee findById(int id);
    // save an employee
    Employee save(Employee employee);
    // delete an employee by id
    void deleteById(int id);
}
