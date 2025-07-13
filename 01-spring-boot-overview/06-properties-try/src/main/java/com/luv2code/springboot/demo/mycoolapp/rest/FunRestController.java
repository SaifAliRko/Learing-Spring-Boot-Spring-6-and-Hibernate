package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
  @Value("${coach.name}")
  private String  coachName;
  @Value("${team.name}")
  private String  teamName;
  @Value("${team.members}")
  private String[] teamMembers;

  @GetMapping("/team")
  public String getTeamInfo() {
    StringBuilder teamInfo = new StringBuilder("Coach: " + coachName + ", Team: " + teamName + ", Members: ");
    for (String member : teamMembers) {
      teamInfo.append(member).append(" ");
    }
    return teamInfo.toString().trim();
  }
  @GetMapping("/")
  public String sayHello() {
    return "Hello World!";
  }

  @GetMapping("/workout")
  public String getDailyWorkout() {
    return "Run 5k!";
  }
  @GetMapping("/fortune")
  public String getDailyFortune() {
    return "Today is your lucky day!";
  }
  @GetMapping("/hello")
  public String sayHelloAgain() {
    return "Hello Again!";
  }
  @GetMapping("/goodbye")
  public String sayGoodbye() {
    return "Goodbye!";
  }

}
