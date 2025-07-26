package com.luv2code.springboot.thymeleafdemo.model;

public class Student {
  private String firstName;
  private String lastName;
  // country field added
  private String country;
  // favourite language field added
  private String favouriteLanguage;

  public String getFavouriteLanguage() {
    return favouriteLanguage;
  }
// favorite operating system field added
  private String[] favoriteOperatingSystem;
  public String[] getFavoriteOperatingSystem() {
    return favoriteOperatingSystem;
  }
  public void setFavoriteOperatingSystem(String[] favoriteOperatingSystem) {
    this.favoriteOperatingSystem = favoriteOperatingSystem;
  }
  
  public void setFavouriteLanguage(String favouriteLanguage) {
    this.favouriteLanguage = favouriteLanguage;
  }

  public Student() {}

  // getters and setters for all fields
  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

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
