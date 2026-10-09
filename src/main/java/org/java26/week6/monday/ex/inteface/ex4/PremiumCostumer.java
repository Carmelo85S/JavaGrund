package org.java26.week6.monday.ex.inteface.ex4;

public class PremiumCostumer extends Price implements Discountable{
    public final double discount = 0.1;
    public PremiumCostumer(int price){
        super(price);
    }

    @Override
    public double applyDiscount(int price) {
        return (double)price * discount;
    }
}
