package com.luv2code.democrud.dao;

import com.luv2code.democrud.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
  // thats it no need to write any code here, just extending JpaRepository
}
