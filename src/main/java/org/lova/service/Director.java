package org.lova.service;

public class Director {
  public void constructSportsCar(Builder builder) {
    builder.setSeats(2);
    builder.setEngine("Eight+ Cylinder Engines");
  }

  public void constructSuv(Builder builder) {
    builder.setSeats(4);
    builder.setEngine("Inline Six Cylinder Engine");
  }
}
