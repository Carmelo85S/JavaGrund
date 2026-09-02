package week2.L4;

import java.util.Scanner;

public class RedIntBetween {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int readInteger = InputHelper.readInt(scanner, "Enter an integer: ");
        System.out.println(readInteger);

        int readBetween = InputHelper.readIntBetween(
                scanner,
                "Enter a number between 2 and 49: ",
                2,
                49
        );
        System.out.println(readBetween);

        scanner.close();
    }
}