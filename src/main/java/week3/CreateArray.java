package week3;

public class CreateArray {
    public static void main(String[] args) {

        // Skapa en int[] med plats för 5 tal
        int[] numbers = new int[5];

        // Fyll arrayen
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Skriv ut alla tal
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        // Skriv ut hur många tal arrayen rymmer
        System.out.println("Arrayen rymmer " + numbers.length + " tal.");
    }
}