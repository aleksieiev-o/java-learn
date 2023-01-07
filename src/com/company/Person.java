package com.company;

import static java.lang.System.out;

public class Person {
  static int counter;

  static {
    out.println("First init object");
    counter = 0;
  }

  Person() {
    out.println("Create new object");
    counter++;
  }

  static void sum(int a, int b) {
    out.printf("Sum is %d", a + b);
  }

  public void getCounter() {
    out.println(counter);
  }
}
