package org.lova.model;

import java.util.Objects;
import org.lova.model.type.TripComputer;

public class Car {
  private int seats;
  private String engine;
  private TripComputer tripComputer;
  private Boolean gps;

  @Override
  public String toString() {
    return "Car{"
        + "Seats="
        + seats
        + ", engine='"
        + engine
        + '\''
        + ", tripComputer="
        + tripComputer
        + ", gps="
        + gps
        + '}';
  }

  public Car(int seats, String engine, TripComputer tripComputer, Boolean gps) {
    this.seats = seats;
    this.engine = engine;
    this.tripComputer = tripComputer;
    this.gps = gps;
  }

  public Car() {}

  public void setSeats(int seats) {
    this.seats = seats;
  }

  public void setEngine(String engine) {
    this.engine = engine;
  }

  public void setTripComputer(TripComputer tripComputer) {
    this.tripComputer = tripComputer;
  }

  public void setGps(Boolean gps) {
    this.gps = gps;
  }

  public int getSeats() {
    return seats;
  }

  public String getEngine() {
    return engine;
  }

  public TripComputer getTripComputer() {
    return tripComputer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Car car = (Car) o;
    return seats == car.seats
        && Objects.equals(engine, car.engine)
        && Objects.equals(tripComputer, car.tripComputer)
        && Objects.equals(gps, car.gps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seats, engine, tripComputer, gps);
  }

  public Boolean getGps() {
    return gps;
  }
}
