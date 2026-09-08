package week3.LightOOP.ex3;

public class CarHasEngine {
    public static void main(String[] args) {
        // Create a Car class with the fields:
        // name, model, year, price and public Engine engine.
        // Add a constructor that initializes all four fields.
        //
        // In Main:
        // Create an Engine object and a Car object.
        // Print the car information, including the engine's name
        // and fuel type (car.engine.name and car.engine.fuelType).
        Engine engine = new Engine("2.9L twin-turbo V8", 478, FuelType.PETROL);
        Car ferrari = new Car("Ferrari","F-40", 1987, 300000, engine);

        System.out.printf("Car name: %s%n",ferrari.name);
        System.out.printf("Year of production: %d%n",ferrari.year);
        System.out.printf("Price: %d € %n",ferrari.price);
        System.out.printf("Engine model: %s%n",ferrari.engine.model);
        System.out.printf("Fuel type: %s%n",ferrari.engine.fuelType);
        System.out.printf("Horse power: %d%n",ferrari.engine.horsePower);

    }
}
