package org.java26.week6.monday.ArvPolymorfism;

public class Horse extends Animal  {
    boolean hasMane;

    public Horse(String name, int amountOfLegs, boolean hasMane) {
        super(name, amountOfLegs);
        this.hasMane = hasMane;
    }

    @Override //fail safe
    public void makeSound() {
        System.out.println("HiHihIh");
    }

    @Override
    public void eatFood() {
        System.out.println(name + " eat apples!");
    }
}

