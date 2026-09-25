package org.java26.week4.carRegistration;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        //Skapa ett program som hanterar inläsning och sparning av bil-data via en JSON-fil (cars.json) med hjälp av
        //Jacksons ObjectMapper.

        //1.Förberedelser (Klasser):
        //Använd FuelType, Engine och Car.

        //Obs: Jackson kräver en tom standardkonstruktor (public Car() {}) i modellklasserna samt public-fält
        //eller getters/setters för att kunna deserialisera JSON.

        Engine ferrari = new Engine("V8-ferrari", 250);
        Engine porsche = new Engine("Porsche 911", 240);

        Car car1 = new Car("Ferrari f40", 1987, FuelType.PETROL, ferrari);
        Car car2 = new Car("Porsche", 1987, FuelType.PETROL, porsche);

        //2.Skriva till JSON (Output):
        //Skapa en metod/kod i Main som skapar en lista (List<Car>) med minst två Car-objekt (som var och
        //en har ett Engine-objekt).
        //Använd Jackson (ObjectMapper) för att spara ned listan till filen cars.json.

        Path path = Path.of("cars.json");
        List<Car> carList = new ArrayList<>();
        carList.add(car1);
        carList.add(car2);

        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter()
                .writeValue(path.toFile(), carList);


        //3.Läsa från JSON (Input) & Felhantering:
        //Skapa en metod public static List<Car> loadCars(Path path) som läser in listan från cars.json.
        //Om filen inte finns eller om ett fel uppstår vid läsningen ska koden fånga IOException, skriva ut ett
        //felmeddelande till konsolen och returnera en tom lista — programmet får inte krascha.
        //Skriv ut de inlästa bilarna och deras motordata i konsolen.
        List<Car> cars = loadCars(path);
        for (Car car : cars) {
            System.out.println("Car: " + car.name);
            System.out.println("Year: " + car.year);
            System.out.println("Fuel type: " + car.fuelType);
            System.out.println("Engine: " + car.engine.model);
            System.out.println("HP: " + car.engine.hp);
            System.out.println("===========================");
        }


    }

    public static List<Car> loadCars(Path path) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.readValue(
                    path.toFile(),
                    new TypeReference<List<Car>>() {}
            );

        } catch (IOException e) {
            System.out.println("Could not load from file: " + path);
            return new ArrayList<>();
        }
    }
}


