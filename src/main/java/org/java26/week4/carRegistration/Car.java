package org.java26.week4.carRegistration;

public class Car {
    public String name;
    public int year;
    public FuelType fuelType;
    public Engine engine;


    public Car() {
    }

    public Car(String name, int year, FuelType fuelType, Engine engine) {
        this.name = name;
        this.year = year;
        this.fuelType = fuelType;
        this.engine = engine;
    }
}

