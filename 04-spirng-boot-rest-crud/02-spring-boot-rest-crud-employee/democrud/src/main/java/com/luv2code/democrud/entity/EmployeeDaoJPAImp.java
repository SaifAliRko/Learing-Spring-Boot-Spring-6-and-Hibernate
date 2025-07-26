package com.luv2code.democrud.entity;

import java.util.List;

import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

@Repository
public class EmployeeDaoJPAImp implements EmployeeDao {
    // define fields for entity manager
    private EntityManager entityManager;

    // setup constructor injection for entity manager
    public EmployeeDaoJPAImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    // implement the findAll method
    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> query = entityManager
                .createQuery("FROM Employee", Employee.class);
        List<Employee> employees = query.getResultList();
        // return the results
        return employees;
    }

    @Override
    public Employee findById(int id) {
        return entityManager.find(Employee.class, id);
    }

    @Override
    public Employee save(Employee employee) {
        return entityManager.merge(employee);
    }

    @Override
    public void deleteById(int id) {
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.remove(employee);
    }
}
