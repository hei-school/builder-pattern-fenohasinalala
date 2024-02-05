package org.lova.service;

public class Director {
  public void constructSportsCar(Builder builder) {
    if (builder==null){
      throw new RuntimeException("Builder is mandatory");
    }
    builder.setSeats(2);
    builder.setEngine("Eight+ Cylinder Engines");
  }

  public void constructSuv(Builder builder) {
    if (builder==null){
      throw new RuntimeException("Builder is mandatory");
    }
    builder.setSeats(4);
    builder.setEngine("Inline Six Cylinder Engine");
  }
}
