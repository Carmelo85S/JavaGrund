package week3.LightOOP.ex3;

public class Engine {
    public String model;
    public int horsePower;
    public FuelType fuelType;

    public Engine(String model, int horsePower, FuelType fuelType){
        this.model = model;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }
}
