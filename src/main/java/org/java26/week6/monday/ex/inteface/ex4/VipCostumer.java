package org.java26.week6.monday.ex.inteface.ex4;

public class VipCostumer extends Price implements Discountable{
    public final double discount = 0.2;

    public VipCostumer(int price){
        super(price);
    }

    @Override
    public double applyDiscount(int price) {
        double finalPrice = price - (double)price * discount;;
        return finalPrice;
    }
}
