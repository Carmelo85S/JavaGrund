package org.java26.week6.monday.ArvPolymorfismInterfaces;

public class Dog extends Animal implements Pettable { //Arv från Animal
    boolean hasPattern;

    public Dog(String name, int amountOfLegs,MoveStrategy moveStrategy, boolean hasPattern) {
        super(name, amountOfLegs, moveStrategy);
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

    @Override
    public void getPetted() {
        System.out.println(name + " eat a bone and is petted.");
    }
}