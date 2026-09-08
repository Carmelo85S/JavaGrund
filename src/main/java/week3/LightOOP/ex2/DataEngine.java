package week3.LightOOP.ex2;

public class DataEngine {
    public static void main(String[] args) {
        //Skapa klassen Engine med
        // fälten name, horsepower, fuelType
        // samt en konstruktor som kräver alla tre värden vid instansiering.
        //I Main: Skapa ett Engine-objekt via dess konstruktor och skriv ut fälten i konsolen.
        Engine car = new Engine("V6 Turbo", 500, FuelType.PETROL);
        System.out.println(car.name + " - " + car.hp + "hp " + car.type);
    }
}
