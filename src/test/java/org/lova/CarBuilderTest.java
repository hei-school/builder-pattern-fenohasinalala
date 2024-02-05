package org.lova;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.lova.model.Car;
import org.lova.model.type.TripComputer;
import org.lova.service.CarBuilder;

import static org.lova.model.type.TripComputer.TRIP_COMP1;

public class CarBuilderTest {

    @Test
    public void test_car_creation_by_builder(){
        int seats = 2;
        String engine = "V8";
        TripComputer tripComputer = TRIP_COMP1;
        Boolean gps = true;

        Car expected = new Car(seats,engine,tripComputer,gps);

        CarBuilder builder = new CarBuilder();
        builder.setSeats(seats);
        builder.setEngine(engine);
        builder.setTripComputer(tripComputer);
        builder.setGPS();
        Car actual = builder.getResult();

        assertEquals(expected,actual);
    }

}