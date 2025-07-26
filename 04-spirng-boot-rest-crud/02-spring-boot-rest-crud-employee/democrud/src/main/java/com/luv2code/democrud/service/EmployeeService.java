package com.luv2code.democrud.service;

import java.util.List;

import com.luv2code.democrud.entity.Employee;

public interface EmployeeService {
    List<Employee> findAll();

    // find by id
    Employee findById(int id);

    // save an employee
    Employee save(Employee employee);

    // delete an employee by id
    void deleteById(int id);
}
