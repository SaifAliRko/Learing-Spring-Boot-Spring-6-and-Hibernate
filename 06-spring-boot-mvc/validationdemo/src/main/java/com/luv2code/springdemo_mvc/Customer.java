package com.luv2code.springdemo_mvc;

import com.luv2code.springdemo_mvc.validation.CourseCode;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class Customer {
  // firstname
  private String firstName;

  // lastname
  @NotNull(message = "is required")
  @Size(min = 1, message = "is required")
  private String lastName;

  // it has min value of 0 and max value of 10
  @Min(value = 0, message = "must be greater than or equal to 0")
  @Max(value = 10, message = "must be less than or equal to 10")
  private int freePasses;

  // postal code field
  @Pattern(regexp = "^[a-zA-Z0-9]{5}$", message = "must be 5 characters")
  private String postalCode;

  @CourseCode(value = "TOPS", message = "must start with TOPS")
  private String courseCode;

  public String getCourseCode() {
    return courseCode;
  }

  public void setCourseCode(String courseCode) {
    this.courseCode = courseCode;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }

  public int getFreePasses() {
    return freePasses;
  }

  public void setFreePasses(int freePasses) {
    this.freePasses = freePasses;
  }

  // getters and setters
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
}
