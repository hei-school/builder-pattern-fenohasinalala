package org.lova;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.lova.model.Car;
import org.lova.model.CarManual;
import org.lova.model.type.TripComputer;
import org.lova.service.CarBuilder;
import org.lova.service.CarManualBuilder;
import org.lova.service.Director;

public class DirectorTest {

  @Test
  public void test_car_creation_by_director() {
    int seats = 2;
    String engine = "Eight+ Cylinder Engines";
    TripComputer tripComputer = null;
    Boolean gps = null;

    CarBuilder builder = new CarBuilder();
    Director director = new Director();
    director.constructSportsCar(builder);
    Car actual = builder.getResult();

    Car expected = new Car(seats, engine, tripComputer, gps);
    assertEquals(expected, actual);
  }

  @Test
  public void test_car_manual_creation_by_director() {
    int seats = 2;
    String engine = "Eight+ Cylinder Engines";
    TripComputer tripComputer = null;
    Boolean gps = null;

    CarManualBuilder builder = new CarManualBuilder();
    Director director = new Director();
    director.constructSportsCar(builder);
    CarManual actual = builder.getProduct();

    CarManual expected = new CarManual(seats, engine, tripComputer, gps);
    assertEquals(expected, actual);
  }
}
