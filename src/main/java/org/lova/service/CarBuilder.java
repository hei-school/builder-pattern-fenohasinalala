package org.lova.service;

import org.lova.model.Car;
import org.lova.model.type.TripComputer;

public class CarBuilder implements Builder {

  private Car car;

  public CarBuilder() {
    reset();
  }

  public void reset() {
    car = new Car();
  }

  public void setSeats(int number) {
    car.setSeats(number);
  }

  public void setEngine(String engine) {
    car.setEngine(engine);
  }

  public void setTripComputer(TripComputer tripComputer) {
    car.setTripComputer(tripComputer);
  }

  public void setGps() {
    car.setGps(true);
  }

  public Car getResult() {
    return car;
  }
}
