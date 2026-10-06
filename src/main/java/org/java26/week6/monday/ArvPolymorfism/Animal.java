package org.java26.week6.monday.ArvPolymorfism;

public abstract class Animal {

    String name;
    int amountOfLegs;

    protected Animal(String name, int amountOfLegs){
        this.name = name;
        this.amountOfLegs = amountOfLegs;
    }

    void makeSound () {

        System.out.println(name + " sounds!");
    }

    public abstract void eatFood();

}