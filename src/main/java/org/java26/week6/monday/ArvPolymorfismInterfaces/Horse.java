package org.java26.week6.monday.ArvPolymorfismInterfaces;

public class Horse extends Animal  {
    boolean hasMane;

    public Horse(String name, int amountOfLegs, MoveStrategy moveStrategy, boolean hasMane) {
        super(name, amountOfLegs, moveStrategy);
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

