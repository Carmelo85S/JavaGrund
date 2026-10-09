package org.java26.week6.monday.ex.inteface.ex1;

public class Guitar extends Instrument implements Playable{
     boolean hasString;

    public Guitar(String name, boolean hasString){
        super(name);
        this.hasString = hasString;
    }


    @Override
    public void playable() {
        System.out.println("Playing guitar");
    }
}
