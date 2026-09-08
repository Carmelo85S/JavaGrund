package week3.LightOOP.ex3;

public class Car {
    public String model;
    public int year;
    public double price;
    public Engine engine;

    public Car(String model, int year, double price, Engine engine){
        this.model = model;
        this.year = year;
        this.price = price;
        this.engine = engine;
    }
}
