package com.company;

public class Main {

  public static void main(String[] args) {
    Person person = new Person("Tom");
    person.getName();

    Employee company = new Employee(person.name, "Google");
    company.getCompanyAndName();
    company.getName();
  }
}
