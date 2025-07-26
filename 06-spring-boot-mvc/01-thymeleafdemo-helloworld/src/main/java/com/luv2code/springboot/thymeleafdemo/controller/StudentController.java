package com.luv2code.springboot.thymeleafdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.luv2code.springboot.thymeleafdemo.model.Student;

@Controller
public class StudentController {
  @Value("${countries}")
  private List<String> countries;

  @Value("${languages}")
  private List<String> languages;

  @Value("${operatingSystems}")
  private List<String> operatingSystems;

  @GetMapping("/showStudentForm")
  public String showForm(Model model) {
    Student theStudent = new Student();
    model.addAttribute("student", theStudent);
    model.addAttribute("countries", countries);
    model.addAttribute("languages", languages);
    model.addAttribute("operatingSystems", operatingSystems);
    return "student-form";
  }

  @PostMapping("/processStudentForm")
  public String postMethodName(@ModelAttribute("student") Student theStudent) {
    // log the student data input
    System.out.println(
        "Student: " + theStudent.getFirstName() + ", Last Name: " + theStudent.getLastName() + ")");
    return "student-confirmation";
  }
}
