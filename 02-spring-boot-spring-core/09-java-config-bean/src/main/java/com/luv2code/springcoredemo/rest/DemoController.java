package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springcoredemo.common.Coach;

@RestController
public class DemoController {
  private Coach coach;

  public DemoController(
      @Qualifier("aquatic") Coach mycoach) {
    System.out.println("In Constructor: " + getClass().getSimpleName());
    this.coach = mycoach;

  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return coach.getDailyWorkout();
  }

}
