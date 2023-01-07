package study;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Person {
  private String name;
  private int age;

  {
    Scanner scanner = new Scanner(in);

    out.println("Input your name...");
    String name = scanner.nextLine();
    this.setName(name.trim());

    out.println("input your age...");
    int age = scanner.nextInt();
    this.setAge(age);
  }

  public void displayInfo() {
    out.printf("Name is %s, age is %d\n", this.name, this.age);
  }

  private void setName(String name) {
    try {
      if (!name.equals("")) {
        this.name = name;
      } else {
        throw  new Exception("Name must don't empty");
      }
    } catch (Exception e) {
      this.showErrorMessage(e.getMessage());
    }

  }

  private void setAge(int age) {
    try {
      if (age > 0 && age < 120) {
        this.age = age;
      } else {
        throw new Exception("Age is incorrect");
      }
    } catch (Exception e) {
      this.showErrorMessage(e.getMessage());
    }
  }

  private void showErrorMessage(String message) {
    out.println(message);
  }
}
