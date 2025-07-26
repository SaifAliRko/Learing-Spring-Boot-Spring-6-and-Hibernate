package com.luv2code.springdemo_mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.validation.Valid;

@Controller
public class CustomerController {
  // add an initbinder to convert trim input strings
  @InitBinder
  public void initBinder(WebDataBinder dataBinder) {
    dataBinder.registerCustomEditor(String.class, new StringTrimmerEditor(true));
  }

  @GetMapping("/")
  public String showForm(Model model) {
    // create a new customer object
    Customer theCustomer = new Customer();
    // add it to the model
    model.addAttribute("customer", theCustomer);
    return "customer-form";
  }
 
  // process the form for validation
  @PostMapping("/processForm")
  public String processForm(
      @Valid @ModelAttribute("customer") Customer theCustomer, BindingResult theBindingResult) {
    System.out.println("Last Name: |" + theCustomer.getLastName() + "|");
    System.out.println("Binding Result: " + theBindingResult);
    if (theBindingResult.hasErrors()) {
      return "customer-form";
    }
    // if no errors, submit the form
    return "customer-confirmation";
  }
}
