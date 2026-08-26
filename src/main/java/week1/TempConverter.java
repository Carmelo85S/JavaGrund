package week1;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Celsius : ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        double kelvin = (celsius + 273.15);
        System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
        System.out.printf("Kelvin: %.2f%n", kelvin);
    }
}
