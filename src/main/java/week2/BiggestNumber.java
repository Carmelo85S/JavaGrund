package week2;

public class BiggestNumber {
    public static void main(String[] args) {
        //Skriv två metoder med samma namn: en som tar två int och returnerar det största, och en som tar två double
        //och returnerar det största. Anropa båda från main och låt Java välja rätt version automatiskt utifrån vad du
        //skickar in.

        int a = 15;
        int b = 8;

        System.out.println(compareNum(a, b));

        double c = 8.4;
        double d = 5.3;

        System.out.println(compareNum(c, d));
    }

    public static int compareNum(int a, int b) {
        return Math.max(a, b);
    }

    public static double compareNum(double a, double b) {
        return Math.max(a, b);
    }
}