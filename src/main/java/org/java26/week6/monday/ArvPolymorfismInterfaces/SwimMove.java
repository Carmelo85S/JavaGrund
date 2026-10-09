package org.java26.week6.monday.ArvPolymorfismInterfaces;

public class SwimMove implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("Swim around");
    }
}
