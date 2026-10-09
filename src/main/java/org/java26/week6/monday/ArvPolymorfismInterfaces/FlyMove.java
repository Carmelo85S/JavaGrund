package org.java26.week6.monday.ArvPolymorfismInterfaces;

public class FlyMove implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("Fly around");
    }
}
