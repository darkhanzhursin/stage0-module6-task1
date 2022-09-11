package com.epam.mjc.stage0;

public class Animal {

  private String color;

  private int numberOfPaws;

  private boolean hasFur;

  public Animal(String color, int numberOfPaws, boolean hasFur) {
    this.color = color;
    this.numberOfPaws = numberOfPaws;
    this.hasFur = hasFur;
  }

  public String getDescription() {
    String fur;
    String quantityOfPaws;
    if (hasFur==true) {
      fur = "a";
    } else {
      fur = "no";
    }

    if (numberOfPaws == 1) {
      quantityOfPaws = "paw";
    } else
    {
      quantityOfPaws = "paws";
    }

    return "This animal is mostly " + color + ". It has " + numberOfPaws +
        " " + quantityOfPaws + " and " + fur + " fur.";
  }

}
