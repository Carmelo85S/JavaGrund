package week2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BmiMetods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ta en BMI-uträkning och dela upp den i flera metoder: en som räknar ut BMI utifrån vikt och längd, en som
        //översätter ett BMI till en kategori (undervikt / normalvikt / övervikt / fetma), och en som skriver ut resultatet
        //snyggt. main ska bli kort och läsas som ett innehållsregister.
        int height = getHeight(scanner);
        double weight = getWeight(scanner);
        double bmi = getBMI(height, weight);
        System.out.printf("Your BMI is %.2f%n", bmi);
        checkCategory(bmi);
    }

    public static int getHeight(Scanner scanner){

        while(true) {
            System.out.print("Enter your height(cm): ");
            try{
                int height = scanner.nextInt();
                scanner.nextLine();
                if(height > 100 && height < 220) {
                    return height;
                }
                System.out.println("Value should be between 100cm and 220cm ");
            }catch (InputMismatchException e){
                System.out.println("Not a valid input, try again.");
                scanner.nextLine();
            }
        }

    }

    public static double getWeight(Scanner scanner){

        while(true) {
            System.out.print("Enter your weight: ");
            try{
                double weight = scanner.nextDouble();
                scanner.nextLine();
                if(weight > 30 && weight < 220) {
                    return weight;
                }
                System.out.println("Value should be between 30kg and 220kg ");
            }catch (InputMismatchException e){
                System.out.println("Not a valid input, try again.");
                scanner.nextLine();
            }
        }

    }

    public static double getBMI(int height, double weight){
        double heightInMeters = height / 100.0;
        return weight/(heightInMeters*heightInMeters);
    }

    public static void checkCategory(double bmi){
        if(bmi <= 18.5){
            System.out.println("Your are underweight");
        }else if(bmi > 18.5 && bmi <= 25){
            System.out.println("You are normal weight");
        } else if (bmi > 25 && bmi < 30) {
            System.out.println("Your are over weight");
        } else {
            System.out.println("I am sorry but you are obese");
        }

    }

}
