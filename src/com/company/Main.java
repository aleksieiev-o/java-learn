package com.company;

public class Main {

  public static void main(String[] args) {
    Person personOne = new Person();
    personOne.getCounter();

    Person personTwo = new Person();
    personTwo.getCounter();

    Person personThree = new Person();
    personThree.getCounter();

    Person.sum(1, 4);
  }
}
