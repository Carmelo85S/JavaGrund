package week1;

import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Celsius : ");
        double celsius = scanner.nextDouble();

        System.out.println("Convert temperature");
        System.out.println("Farenheit press F");
        System.out.println("Kelvin press K");

        System.out.print("You chosen option is: ");
        char choose = scanner.next().charAt(0);
        
        switch(choose){
            case 'F':
                double fahrenheit = (celsius * 9.0 / 5.0) + 32;
                System.out.printf("Fahrenheit: %.2f%n", fahrenheit);
                break;
            case 'K':
                 double kelvin = (celsius + 273.15);
                 System.out.printf("Kelvin: %.2f%n", kelvin);
                 break;
            default:
                System.out.println("Not allowed");
                break;
        }
        scanner.close();
    }
}
