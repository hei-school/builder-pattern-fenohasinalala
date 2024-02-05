package org.lova;

import static org.junit.Assert.assertEquals;
import static org.lova.model.type.TripComputer.TRIP_COMP1;

import org.junit.Test;
import org.lova.model.Car;
import org.lova.model.type.TripComputer;
import org.lova.service.CarBuilder;

public class CarBuilderTest {

  @Test
  public void test_car_creation_by_builder() {
    int seats = 2;
    String engine = "V8";
    TripComputer tripComputer = TRIP_COMP1;
    Boolean gps = true;

    CarBuilder builder = new CarBuilder();
    builder.setSeats(seats);
    builder.setEngine(engine);
    builder.setTripComputer(tripComputer);
    builder.setGps();
    Car actual = builder.getResult();

    Car expected = new Car(seats, engine, tripComputer, gps);
    assertEquals(expected, actual);
  }
}
