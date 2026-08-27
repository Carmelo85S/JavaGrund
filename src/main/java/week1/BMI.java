package week1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        //Fråga efter användarens namn, vikt i kilogram och längd i centimeter.
        //Räkna ut och skriv ut personens BMI med en decimal i en hälsningsmening.
        //BMI = vikt i kg delat med (längd i meter)2.
        //Tänk på att längden anges i centimeter men formeln vill ha meter.
        //Var också uppmärksam på i vilken ordning du läser in text och tal — det kan ställa till det på samma sätt som i G10.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Insert you weight (kg): ");
        double weight = sc.nextDouble();
        sc.nextLine();
        System.out.print("enter your height (cm): ");
        double height = sc.nextDouble();
        double heightMeter = height / 100;

        double bmi = weight / Math.pow(heightMeter, 2);
        System.out.printf("Hello %s! Your BMI is %.1f%n", name, bmi);

        sc.close();

    }
}
