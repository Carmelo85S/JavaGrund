package week3;

import java.util.ArrayList;
import java.util.Scanner;

public class NumbersStats {
    public static void main(String[] args) {
        //  Samla tal i en ArrayList<Integer> tills användaren skriver klar (krasch-säkert).
        // Skriv ut listan sorterad
        //  stigande, sedan fallande, och till sist minsta, största och medelvärdet — utan att sortera om.
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<>();
        boolean running = true;

        while (running) {
            try {
                System.out.print("Enter a number: ");
                String userInput = scanner.nextLine();
                if (userInput.equalsIgnoreCase("klar")) {
                    running = false;
                    continue;
                }
                int input = Integer.parseInt(userInput);
                num.add(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input");
            }
        }

        System.out.println("----NOT SORT----");
        for(int numbers : num){
            System.out.print(numbers+ " ");
            System.out.println();
        }

        System.out.println("----SORTED----");
        ArrayList<Integer> sortedArray = new ArrayList<>(num);

        for (int i = 0; i < sortedArray.size() - 1; i++) {
            for (int j = 0; j < sortedArray.size() - 1 - i; j++) {

                if (sortedArray.get(j) > sortedArray.get(j + 1)) {

                    int temp = sortedArray.get(j);
                    sortedArray.set(j, sortedArray.get(j + 1));
                    sortedArray.set(j + 1, temp);
                }
            }
        }

        System.out.println("Sorted: " + sortedArray);

        for (int i = sortedArray.size() - 1; i >= 0; i--) {
            System.out.println(sortedArray.get(i) + " ");
        }

        int min = num.get(0);
        int max = num.get(0);
        int sum = 0;

        for (int value : num) {
            if (value < min) {
                min = value;
            }

            if (value > max) {
                max = value;
            }

            sum += value;
        }

        double average = (double) sum / num.size();

        System.out.println("Minsta: " + min);
        System.out.println("Största: " + max);
        System.out.println("Medelvärdet: " + average);
    }
}
