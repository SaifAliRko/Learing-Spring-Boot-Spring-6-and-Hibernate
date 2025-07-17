package com.luv2code.springcoredemo.common;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype") // This annotation indicates that a new instance of CricketCoach will be created each time it is requested.
@Component
public class CricketCoach implements Coach {
  public CricketCoach() {
    System.out.println("In Constructor: " + getClass().getSimpleName());
  }

  @Override
  public String getDailyWorkout() {
    return "Practice fast bowling for 15 minutes ahan.";
  }
}
