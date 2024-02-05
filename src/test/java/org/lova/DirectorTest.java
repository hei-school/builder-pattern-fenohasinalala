package org.lova;

import org.junit.Test;
import org.lova.model.Car;
import org.lova.model.CarManual;
import org.lova.model.type.TripComputer;
import org.lova.service.CarBuilder;
import org.lova.service.CarManualBuilder;
import org.lova.service.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    @Test
    public void test_car_creation_by_director(){
        int seats = 2;
        String engine = "Eight+ Cylinder Engines";
        TripComputer tripComputer = null;
        Boolean gps = null;

        Car expected = new Car(seats,engine,tripComputer,gps);

        CarBuilder builder = new CarBuilder();
        Director director = new Director();
        director.constructSportsCar(builder);
        Car actual = builder.getResult();
        assertEquals(expected,actual);
    }

    @Test
    public void test_car_manual_creation_by_director(){
        int seats = 2;
        String engine = "Eight+ Cylinder Engines";
        TripComputer tripComputer = null;
        Boolean gps = null;

        CarManual expected = new CarManual(seats,engine,tripComputer,gps);

        CarManualBuilder builder = new CarManualBuilder();
        Director director = new Director();
        director.constructSportsCar(builder);
        CarManual actual = builder.getProduct();
        assertEquals(expected,actual);
    }
}
