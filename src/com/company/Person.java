package com.company;

import static java.lang.System.out;

public class Person {
  String name;

  public Person(String name) {
    this.name = name;
  }

  public String getName() {
    out.println("Person name is " + name);
    return name;
  }
}
