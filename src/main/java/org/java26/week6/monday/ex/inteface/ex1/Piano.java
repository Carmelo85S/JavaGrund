package org.java26.week6.monday.ex.inteface.ex1;

public class Piano extends Instrument implements Playable{

    public Piano(String name){
        super(name);
    }

    @Override
    public void playable() {
        System.out.println("Playing piano");
    }
}
