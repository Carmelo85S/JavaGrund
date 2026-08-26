package week1;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" ---WELCOME TO TEMPERATURE CONVERTER!---");
        System.out.println("|   Choose an option:                   |");
        System.out.println("|   C = Celsius                         |");
        System.out.println("|   F = Fahrenheit                      |");
        System.out.println("|   K = Kelvin                          |");
        System.out.println(" ---------------------------------------");

        System.out.print("Option: ");
        String tempChoice = scanner.nextLine().toUpperCase();

        if(tempChoice.equals("C") || tempChoice.equals("F") || tempChoice.equals("K")) {

            System.out.print("Insert temperature: ");
            double temperature = scanner.nextDouble();

            switch (tempChoice) {

            case "C":
                double fahrenheit = (temperature * 9.0 / 5.0) + 32;
                double kelvin = temperature + 273.15;

                System.out.printf("%.2f Celsius = %.2f Fahrenheit%n",
                        temperature, fahrenheit);

                System.out.printf("%.2f Celsius = %.2f Kelvin%n",
                        temperature, kelvin);
                break;

            case "F":
                double celsius = (temperature - 32) * 5.0 / 9.0;
                double kelvinFromF = (temperature - 32) * 5.0 / 9.0 + 273.15;

                System.out.printf("%.2f Fahrenheit = %.2f Celsius%n",
                        temperature, celsius);

                System.out.printf("%.2f Fahrenheit = %.2f Kelvin%n",
                        temperature, kelvinFromF);
                break;

            case "K":
                double celsiusFromK = temperature - 273.15;
                double fahrenheitFromK = (temperature - 273.15) * 9.0 / 5.0 + 32;

                System.out.printf("%.2f Kelvin = %.2f Celsius%n",
                        temperature, celsiusFromK);

                System.out.printf("%.2f Kelvin = %.2f Fahrenheit%n",
                        temperature, fahrenheitFromK);
                break;

            default:
                System.out.println("Not allowed");
        }
        } else {
            System.out.println("Get out of here");
        }

        scanner.close();
    }
}