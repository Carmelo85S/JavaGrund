package week3.LightOOP.ex3;

public class Car {
    public String name;
    public String model;
    public int year;
    public int price;
    public Engine engine;

    public Car(String name, String model, int year, int price, Engine engine){
        this.name = name;
        this.model = model;
        this.year = year;
        this.price = price;
        this.engine = engine;
    }
}
