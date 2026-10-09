package org.java26.week6.monday.ex.inteface.ex1;

public class Instrument implements Playable {
    private String name;

    public Instrument(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void playable() {

    }
}
