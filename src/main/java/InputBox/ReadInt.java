package InputBox;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadInt {
    public static int readInt(Scanner scanner) {
        while (true) {
            try {
                int value = scanner.nextInt();
                scanner.nextLine();
                return value;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input");
            }
        }
    }
}
