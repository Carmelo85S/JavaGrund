package week3.LightOOP.ex4;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class CarInputValidation {
    public static void main(String[] args) {
        //Let the user enter the fuel type and price using `Scanner`.
        //Convert the input text to the `FuelType` enum using `FuelType.valueOf(...)
        //Validate the price in `Main`:
        //if the price is greater than 0,
        //create a new `Car` object using its constructor
        //with the entered price and an `Engine` that has the specified fuel type.

        Scanner scanner = new Scanner(System.in);

        FuelType fuelInput;
        int price;

        System.out.print("Enter fuel type: ");
        try {
            String input = scanner.nextLine().toUpperCase(Locale.ROOT);
            fuelInput = FuelType.valueOf(input);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid fuel type. Choose between: ");
            System.out.println("DIESEL");
            System.out.println("PETROL");
            System.out.println("ELECTRIC");
            System.out.println("HYBRID");

            return;
        }
        System.out.print("Enter price: ");
        try {
            price = scanner.nextInt();
            if (price > 0) {
                Car ferrari = new Car("Ferrari", "F-40", price, 1987, fuelInput);

                System.out.println(ferrari.model);
                System.out.println(ferrari.name);
                System.out.println(ferrari.price);
                System.out.println(ferrari.year);
                System.out.println(ferrari.fuelType);
            } else {
                System.out.println("Price must be greater than 0");
            }

        } catch (InputMismatchException e) {
            System.out.println("Not a number");
        }


    }
}

