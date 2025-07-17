package com.luv2code.cruddemo.dao;

import java.util.List;

import com.luv2code.cruddemo.entity.Student;

public interface StudentDAO {

    //saveStudent
    void saveStudent(Student theStudent);

    // findbyid
    Student findById(Integer id);

    //findAll
    List<Student> findAll();

    //find by last name
    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);

    // delete by id
    void deleteById(Integer id);

    // delete all
    int deleteAll();
}
