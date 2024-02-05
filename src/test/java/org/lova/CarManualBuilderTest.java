package org.lova;

import org.junit.Test;
import org.lova.model.Car;
import org.lova.model.CarManual;
import org.lova.model.type.TripComputer;
import org.lova.service.CarBuilder;
import org.lova.service.CarManualBuilder;

import static org.junit.Assert.assertEquals;
import static org.lova.model.type.TripComputer.TRIP_COMP1;

public class CarManualBuilderTest {

    @Test
    public void test_car_manual_creation_by_builder(){
        int seats = 2;
        String engine = "V8";
        TripComputer tripComputer = TRIP_COMP1;
        Boolean gps = true;

        CarManual expected = new CarManual(seats,engine,tripComputer,gps);

        CarManualBuilder builder = new CarManualBuilder();
        builder.setSeats(seats);
        builder.setEngine(engine);
        builder.setTripComputer(tripComputer);
        builder.setGPS();
        CarManual actual = builder.getProduct();

        assertEquals(expected,actual);
    }

}
