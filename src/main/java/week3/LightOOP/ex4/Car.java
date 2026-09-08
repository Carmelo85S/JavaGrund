package week3.LightOOP.ex4;

public class Car {
    public String name;
    public String model;
    public int price;
    public int year;
    public FuelType fuelType;

    public Car(String name, String model, int price, int year, FuelType fuelType){
        this.name = name;
        this.model = model;
        this.price = price;
        this.year = year;
        this.fuelType = fuelType;
    }
}
