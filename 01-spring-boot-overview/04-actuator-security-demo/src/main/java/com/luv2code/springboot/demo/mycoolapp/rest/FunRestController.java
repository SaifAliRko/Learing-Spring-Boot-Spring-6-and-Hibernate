package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

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
