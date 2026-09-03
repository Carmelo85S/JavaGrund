package InputBox;

import java.util.Scanner;

public class InputBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(ReadDoubleBetween.readDoubleBetween(scanner, "Ciao", 4, 51));
    }
}
