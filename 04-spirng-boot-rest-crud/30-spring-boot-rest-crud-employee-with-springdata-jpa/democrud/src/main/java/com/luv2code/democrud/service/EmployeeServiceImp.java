package com.luv2code.democrud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.luv2code.democrud.dao.EmployeeRepository;
import com.luv2code.democrud.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

    // inject employee dao
    private final EmployeeRepository employeeRepository;

    // Constructor injection for EmployeeRepository
    public EmployeeServiceImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);
        if (result.isPresent()) {
            return result.get();
        } else {
            throw new RuntimeException("Did not fin d employee id - " + id);
        }
    }

    @Override
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeeRepository.deleteById(id);
    }

}
