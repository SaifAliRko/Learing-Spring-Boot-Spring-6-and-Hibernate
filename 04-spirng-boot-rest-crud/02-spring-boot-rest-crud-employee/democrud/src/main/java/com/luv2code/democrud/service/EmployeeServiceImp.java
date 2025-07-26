package com.luv2code.democrud.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.luv2code.democrud.entity.Employee;
import com.luv2code.democrud.entity.EmployeeDao;

import jakarta.transaction.Transactional;

@Service
public class EmployeeServiceImp implements EmployeeService {

    // inject employee dao
    private EmployeeDao employeeDao;

    // Constructor injection for EmployeeDao
    public EmployeeServiceImp(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeeDao.findById(id);
    }

    @Transactional
    @Override
    public Employee save(Employee employee) {
        return employeeDao.save(employee);
    }

    @Transactional
    @Override
    public void deleteById(int id) {
        employeeDao.deleteById(id);
    }

}
