package week1;

public class Discount {
    public static void main(String[] args) {
        double price = 199.00;
        int discountPercent = 20;
        double discountAmount = price * discountPercent / 100;
        double finalPrice = price -discountAmount;
        System.out.println("Du betalar: " + finalPrice + " kr");
    }
}
