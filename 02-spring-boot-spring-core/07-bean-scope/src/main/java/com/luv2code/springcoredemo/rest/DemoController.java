package com.luv2code.springcoredemo.rest;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springcoredemo.common.Coach;

@RestController
public class DemoController {
  private Coach coach;
  private Coach anotherCoach;

  public DemoController(
      @Qualifier("cricketCoach") Coach mycoach, @Qualifier("cricketCoach") Coach myanotherCoach) {
    System.out.println("In Constructor: " + getClass().getSimpleName());
    this.coach = mycoach;
    this.anotherCoach = myanotherCoach;

  }

  @GetMapping("/dailyworkout")
  public String getDailyWorkout() {
    return coach.getDailyWorkout();
  }

  @GetMapping("/check")
  public String check() {
    return "Comparing beans: mycoach==anotherCoach " + (coach == anotherCoach);
  }
}
