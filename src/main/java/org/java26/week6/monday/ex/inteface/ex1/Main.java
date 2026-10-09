package org.java26.week6.monday.ex.inteface.ex1;

public class Main{
    public static void main(String[] args) {
        //Create an interface called Playable with the following method:
        //public interface Playable {
        //    void play();
        //}
        //Create two classes:
        //- Guitar
        //- Piano
        //Both classes must implement Playable and provide their own implementation of play().
        //In the main method:
        //1. Create a Guitar object and a Piano object.
        //2. Call play() on both objects.
        //Expected output:
        //Playing guitar
        //Playing piano

        Instrument guitar = new Guitar("Guitar", true);
        guitar.playable();
        Instrument piano = new Piano("Piano");
        piano.playable();

    }
}
