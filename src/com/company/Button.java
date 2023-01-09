package com.company;

public class Button {
  ButtonClickHandler handler;
  private static int pressCountLog;

  {
    pressCountLog = 0;
  }

  public Button(ButtonClickHandler handler) {
    this.handler = handler;
  }

  void click() {
    this.handler.execute();
    pressCountLog++;
  }

  void getPressCountLog() {
    System.out.println(pressCountLog);
  }
}
