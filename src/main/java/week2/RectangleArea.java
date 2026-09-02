package week2;

public class RectangleArea {
    public static void main(String[] args) {

        int a = 3;
        int b = 345;

        double c = 3.2;
        double d = 4.9;

        System.out.println("Area = "+calculateArea(a,b));
        System.out.println("Area = "+calculateArea(c,d));

    }

    public static int calculateArea(int a, int b){
        return a * b /2;
    }

    public static double calculateArea(double c, double d) {
        return c * d / 2;
    }

}
