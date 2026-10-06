package org.java26.week6.monday.ArvPolymorfism;

public class Cat extends Animal{
    String breed;

    public Cat(String name, int amountOfLegs, String breed) {
        super(name, amountOfLegs);
        this.breed = breed;
    }

    @Override //fail safe
    public void makeSound() {
        super.makeSound();
        System.out.println("Miao");
    }

    @Override
    public void eatFood() {
        System.out.println(name + " eat fish!");
    }
}

