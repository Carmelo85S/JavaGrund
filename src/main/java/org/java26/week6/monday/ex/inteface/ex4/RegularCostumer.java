package org.java26.week6.monday.ex.inteface.ex4;

public class RegularCostumer extends Price implements Discountable{
    public RegularCostumer(int price){
        super(price);
    }
    @Override
    public double applyDiscount(int price) {
        double finalPrice = (double)price;
        return finalPrice;
    }
}
