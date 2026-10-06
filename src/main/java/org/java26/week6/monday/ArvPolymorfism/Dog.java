package org.java26.week6.monday.ArvPolymorfism;

public class Dog extends Animal { //Arv från Animal
    boolean hasPattern;

    public Dog(String name, int amountOfLegs, boolean hasPattern) {
        super(name, amountOfLegs);
        this.hasPattern = hasPattern;
    }
    @Override //fail safe
    public void makeSound() {
        System.out.println("Prrrr");
    }

    @Override
    public void eatFood() {
        System.out.println(name + " eat meat");
    }
}