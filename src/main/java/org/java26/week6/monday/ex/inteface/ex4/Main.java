package org.java26.week6.monday.ex.inteface.ex4;

public class Main {
    public static void main(String[] args) {
        //Define the following interface:
        //public interface Discountable {
        //    double applyDiscount(double price);
        //}
        //Create three classes:
        //- RegularCustomer: no discount.
        //- PremiumCustomer: 10% discount.
        //- VipCustomer: 20% discount.
        //In the main method, apply each discount to a price of €100.
        //Expected output:
        //Regular: 100.0
        //Premium: 90.0
        //VIP: 80.0
        //Challenge: Add a fourth customer type without modifying the code that applies the discounts.
        int price = 100;
        RegularCostumer regularCostumer = new RegularCostumer(price);
        PremiumCostumer premiumCostumer = new PremiumCostumer(price);
        VipCostumer vipCostumer = new VipCostumer(price);

        VipCostumer vipCostumer2 = new VipCostumer(price);

        System.out.println("Regular costumer: " + regularCostumer.applyDiscount(price));
        System.out.println("Premium costumer: " + premiumCostumer.applyDiscount(price));
        System.out.println("Vip costumer: " + vipCostumer.applyDiscount(price));
        System.out.println("Vip costumer 2: " + vipCostumer2.applyDiscount(price));


    }
}
