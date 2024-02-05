package org.lova;

import static org.lova.model.type.TripComputer.TRIP_COMP1;

import org.lova.model.Car;
import org.lova.model.CarManual;
import org.lova.model.type.TripComputer;
import org.lova.service.CarBuilder;
import org.lova.service.CarManualBuilder;
import org.lova.service.Director;

public class Main {

  public static void main(String[] args) {
    // FEATURES
    int seats = 4;
    TripComputer tripComputer = TRIP_COMP1;

    Director director = new Director();
    CarBuilder builder = new CarBuilder();
    CarManualBuilder manualBuilder = new CarManualBuilder();

    Car car = builder.getResult();
    CarManual manual = manualBuilder.getProduct();

    System.out.println("CAR WITH EMPTY BUILDER\n");
    System.out.println("Car objet : \n" + car);
    System.out.println(manual.print());

    director.constructSportsCar(builder);
    director.constructSportsCar(manualBuilder);

    System.out.println("CAR BUILD WITH DIRECTOR\n");
    System.out.println("Car objet : \n" + car);
    System.out.println(manual.print());

    System.out.println("ADDING MORE FEATURES\n");
    builder.setTripComputer(tripComputer);
    builder.setGPS();
    builder.setSeats(seats);
    manualBuilder.setTripComputer(tripComputer);
    manualBuilder.setGPS();
    manualBuilder.setSeats(seats);
    System.out.println("Car object: \n" + car);
    System.out.println(manual.print());
  }
}
