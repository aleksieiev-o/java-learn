package com.company;

public class Main {

  public static void main(String[] args) {
    Button button = new Button(new ButtonClickHandler());

    button.click();
    button.getPressCountLog();
    button.click();
    button.getPressCountLog();
    button.click();
    button.getPressCountLog();
  }
}
