package org.lova.service;

import org.lova.model.type.TripComputer;

public interface Builder {
  public void reset();

  public void setSeats(int number);

  public void setEngine(String engine);

  public void setTripComputer(TripComputer tripComputer);

  public void setGPS();
}
