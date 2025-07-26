package com.luv2code.demo.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.demo.entity.Student;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentRestController {

  private List<Student> students;

  // we use @PostConstruct to initialize the list of students once
  @PostConstruct
  public void loadStudents() {
    students = new ArrayList<>();
    students.add(new Student("John", "Doe"));
    students.add(new Student("Saif", "Ali"));
    students.add(new Student("Jane", "Smith"));
  }

  @GetMapping("/students")
  public List<Student> getStudents() {
    return students;
  }

  @GetMapping("/students/{studentId}")
  public Student getMethodName(@PathVariable int studentId) {
    // check the studentId against the size of the list
    if (studentId >= students.size() || studentId < 0) {
      System.out.println("Student id not found - " + studentId);
      throw new StudentNotFoundException("Student id not found - " + studentId);
    }
    return students.get(studentId);
  }
}
