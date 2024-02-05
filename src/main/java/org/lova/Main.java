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

    CarBuilder builder = new CarBuilder();
    Car car = builder.getResult();
    CarManualBuilder manualBuilder = new CarManualBuilder();
    CarManual manual = manualBuilder.getProduct();

    System.out.println("CAR WITH EMPTY BUILDER\n");
    System.out.println("Car objet : \n" + car);
    System.out.println(manual.print());

    Director director = new Director();
    director.constructSportsCar(builder);
    director.constructSportsCar(manualBuilder);

    System.out.println("CAR BUILD WITH DIRECTOR\n");
    System.out.println("Car objet : \n" + car);
    System.out.println(manual.print());

    System.out.println("ADDING MORE FEATURES\n");
    TripComputer tripComputer = TRIP_COMP1;
    builder.setTripComputer(tripComputer);
    builder.setGps();
    int seats = 4;
    builder.setSeats(seats);
    manualBuilder.setTripComputer(tripComputer);
    manualBuilder.setGps();
    manualBuilder.setSeats(seats);
    System.out.println("Car object: \n" + car);
    System.out.println(manual.print());
  }
}
