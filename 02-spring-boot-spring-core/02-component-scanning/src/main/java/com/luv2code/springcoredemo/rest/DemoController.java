package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.util.Coach;

@RestController
public class DemoController {
  private Coach coach;

  @Autowired
  public DemoController(Coach coach) {
    this.coach = coach;
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return coach.getDailyWorkout();
  }
}
