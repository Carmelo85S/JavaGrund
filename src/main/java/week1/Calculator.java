package week1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert first number: ");
        double a = sc.nextDouble();
        System.out.print("Insert second number: ");
        double b = sc.nextDouble();
        double sum = a + b;
        double diff = a - b;
        double prod = a * b;
        double kvot = a / b;
        double rest = a % b;
        System.out.println("ADDITION = " + sum);
        System.out.println("DIFFERENS = " + diff);
        System.out.println("PRODUKT = " + prod);
        System.out.printf("KVOT = %.2f%n", kvot);
        System.out.println("REST = " + rest);
        sc.close();
    }
}
