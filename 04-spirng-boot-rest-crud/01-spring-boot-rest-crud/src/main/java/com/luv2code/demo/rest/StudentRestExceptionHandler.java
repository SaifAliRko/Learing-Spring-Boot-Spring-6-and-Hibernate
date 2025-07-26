package com.luv2code.demo.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class StudentRestExceptionHandler {
  // add exception handling code here
  // add an exception handler using @ExceptionHandler
  @ExceptionHandler
  public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException exc) {

    // create a StudentErrorResponse
    StudentErrorResponse error = new StudentErrorResponse();
    error.setMessage(exc.getMessage());
    error.setStatus(HttpStatus.NOT_FOUND.value());
    error.setTimestamp(System.currentTimeMillis());

    return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
  }

  // add another exception handler to catch any other exceptions (catch-all)
  @ExceptionHandler
  public ResponseEntity<StudentErrorResponse> handleException(Exception exc) {
    // create a StudentErrorResponse
    StudentErrorResponse error = new StudentErrorResponse();
    error.setMessage(exc.getMessage());
    error.setStatus(HttpStatus.BAD_REQUEST.value());
    error.setTimestamp(System.currentTimeMillis());

    return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
  }
}
