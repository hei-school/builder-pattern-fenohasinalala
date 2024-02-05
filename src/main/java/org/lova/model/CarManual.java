package org.lova.model;

import static org.lova.constant.CarManualConstant.ENGINE_FEATURE;
import static org.lova.constant.CarManualConstant.GPS_FEATURE;
import static org.lova.constant.CarManualConstant.INTEGRATED;
import static org.lova.constant.CarManualConstant.NOT_INTEGRATED;
import static org.lova.constant.CarManualConstant.SEAT_FEATURE;
import static org.lova.constant.CarManualConstant.TRIP_COMPUTER_FEATURE;

import java.util.Objects;
import org.lova.model.type.TripComputer;

public class CarManual {
  public CarManual(int seats, String engine, TripComputer tripComputer, Boolean gps) {
    setSeats(seats);
    setTripComputer(tripComputer);
    setEngine(engine);
    setGps(gps);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CarManual manual = (CarManual) o;
    return Objects.equals(seats, manual.seats)
        && Objects.equals(engine, manual.engine)
        && Objects.equals(tripComputer, manual.tripComputer)
        && Objects.equals(gps, manual.gps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(seats, engine, tripComputer, gps);
  }

  private String seats;
  private String engine;
  private String tripComputer;
  private String gps;

  public CarManual() {
    this.seats = getSpecificationFeature(SEAT_FEATURE, NOT_INTEGRATED);
    this.engine = getSpecificationFeature(ENGINE_FEATURE, NOT_INTEGRATED);
    this.tripComputer = getSpecificationFeature(TRIP_COMPUTER_FEATURE, NOT_INTEGRATED);
    this.gps = getSpecificationFeature(GPS_FEATURE, NOT_INTEGRATED);
  }

  public void setSeats(Integer seats) {
    String value = convertNullableValue(seats);
    this.seats = getSpecificationFeature(SEAT_FEATURE, value);
  }

  public void setEngine(String engine) {
    String value = convertNullableValue(engine);
    this.engine = getSpecificationFeature(ENGINE_FEATURE, value);
  }

  public void setTripComputer(TripComputer tripComputer) {
    String value = convertNullableValue(tripComputer);
    this.tripComputer = getSpecificationFeature(TRIP_COMPUTER_FEATURE, value);
  }

  public void setGps(Boolean gps) {
    String value = convertBooleanValue(gps);
    this.gps = getSpecificationFeature(GPS_FEATURE, value);
  }

  private String getSpecificationFeature(String feature, String value) {
    return feature + " specification : " + value;
  }

  private String convertNullableValue(Object value) {
    return value != null ? "" + value : NOT_INTEGRATED;
  }

  private String convertBooleanValue(Boolean value) {
    if (value == null) {
      return NOT_INTEGRATED;
    }
    return value ? INTEGRATED : NOT_INTEGRATED;
  }

  public String print() {
    return "\nCAR MANUAL :\n"
        .concat(seats)
        .concat("\n")
        .concat(engine)
        .concat("\n")
        .concat(tripComputer)
        .concat("\n")
        .concat(gps)
        .concat("\n");
  }
}
