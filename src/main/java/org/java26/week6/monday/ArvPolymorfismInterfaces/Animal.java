package org.java26.week6.monday.ArvPolymorfismInterfaces;

public abstract class Animal{

    String name;
    int amountOfLegs;
    private MoveStrategy moveStrategy;

    protected Animal(String name, int amountOfLegs, MoveStrategy moveStrategy){
        this.name = name;
        this.amountOfLegs = amountOfLegs;
        this.moveStrategy = moveStrategy;
    }

    public void performMove(){
        System.out.print(name + ": ");
        moveStrategy.move();
    }

    public void setMoveStrategy(MoveStrategy moveStrategy){
        this.moveStrategy = moveStrategy;
    }







    void makeSound () {

        System.out.println(name + " sounds!");
    }

    public abstract void eatFood();

}