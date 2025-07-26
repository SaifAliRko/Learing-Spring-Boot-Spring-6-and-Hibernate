package com.luv2code.springdemo_mvc.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseConstraintValidator implements ConstraintValidator<CourseCode, String> {

  private String coursePrefix;
  @Override
  public void initialize(CourseCode courseCode) {
    coursePrefix = courseCode.value();
  }

  @Override
  public boolean isValid(String theCode, ConstraintValidatorContext context) {
    if (theCode == null || theCode.isEmpty()) {
      return true;
    }
    return theCode.startsWith(coursePrefix);
  }
}
