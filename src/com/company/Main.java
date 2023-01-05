package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Input name...");
    String name = scanner.nextLine();

    System.out.println("Input age...");
    int age = scanner.nextInt();

    System.out.println("Input height");
    float height = scanner.nextFloat();

    System.out.printf("Name is %s;\nAge is %d;\nHeight is %f;", name, age, height);
  }
}
