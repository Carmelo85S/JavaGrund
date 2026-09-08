package week3.LightOOP.ex5;

public class Car {
    public String name;
    public int year;
    public int originalPrice;
    public FuelType engine;

    public Car (String name, int year, int originalPrice, FuelType engine){
        this.name = name;
        this.year = year;
        this.originalPrice = originalPrice;
        this.engine = engine;
    }
}
