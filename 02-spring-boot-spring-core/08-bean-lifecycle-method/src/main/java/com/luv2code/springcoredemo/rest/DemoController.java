package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springcoredemo.common.Coach;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@RestController
public class DemoController {
  private Coach coach;

  public DemoController(
      @Qualifier("cricketCoach") Coach mycoach) {
    System.out.println("In Constructor: " + getClass().getSimpleName());
    this.coach = mycoach;

  }

  @PostConstruct
  public void doMyStartupStuff() {
    System.out.println("In PostConstruct: " + getClass().getSimpleName());
  }

  @PreDestroy
  public void doMyCleanupStuff() {
    System.out.println("In PreDestroy: " + getClass().getSimpleName());
  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return coach.getDailyWorkout();
  }

}
