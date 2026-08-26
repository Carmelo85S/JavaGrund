package week1;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Number of seconds: ");
        int totalSeconds = input.nextInt();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.print(totalSeconds + " sekunder är "
                + hours + " h "
                + minutes + " min "
                + seconds + " s");
        input.close();
    }

}
