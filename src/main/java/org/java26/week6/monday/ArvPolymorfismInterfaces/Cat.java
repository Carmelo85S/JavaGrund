package org.java26.week6.monday.ArvPolymorfismInterfaces;

public class Cat extends Animal implements Pettable{
    String breed;

    public Cat(String name, int amountOfLegs, MoveStrategy moveStrategy, String breed) {
        super(name, amountOfLegs, moveStrategy);
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

    @Override
    public void getPetted() {
        System.out.println(name + " are petted");
    }
}

