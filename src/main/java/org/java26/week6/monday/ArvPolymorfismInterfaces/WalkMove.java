package org.java26.week6.monday.ArvPolymorfismInterfaces;

public class WalkMove implements MoveStrategy{
    @Override
    public void move() {
        System.out.println("Walk around");
    }
}
