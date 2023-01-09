package com.company;

import static java.lang.System.out;

public class Employee extends Person {
  String company;

  public Employee(String name, String company) {
    super(name);
    this.company = company;
  }

  @Override
  public String getName() {
    out.println("OVERRIDE method: Person name is " + name + "; " + "Company name is " + company);
    return name;
  }

  public String getCompanyAndName() {
    out.println("Person name is " + name + "; " + "Company name is " + company);
    return company;
  }
}
