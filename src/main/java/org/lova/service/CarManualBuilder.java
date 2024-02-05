package org.lova.service;

import org.lova.model.CarManual;
import org.lova.model.type.TripComputer;

public class CarManualBuilder implements Builder {

    private CarManual manual = new CarManual();
    public void reset() {
        manual = new CarManual();
    }

    public void setSeats(int number) {
        manual.setSeats(number);
    }

    public void setEngine(String engine) {
        manual.setEngine(engine);
    }

    public void setTripComputer(TripComputer tripComputer) {
        manual.setTripComputer(tripComputer);
    }

    public void setGPS() {
        manual.setGps(true);
    }

    public CarManual getProduct() {
        return manual;
    }
}
