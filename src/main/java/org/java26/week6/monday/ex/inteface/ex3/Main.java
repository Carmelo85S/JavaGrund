package org.java26.week6.monday.ex.inteface.ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Create the following interface:
        //public interface Attackable {
        //    int attack();
        //}
        //Implement this interface in three classes:
        //- Warrior
        //- Wizard
        //- Archer
        //Each class must return a different damage value:
        //- Warrior: 20
        //- Wizard: 35
        //- Archer: 25
        //In the main method, create a List<Attackable> containing one object of each class.
        //Iterate through the list and print the damage dealt by each character.
        //Constraint: You must not use instanceof or check the concrete class inside the loop.
        List<Attackable> elements = new ArrayList<>();
        Warrior goku = new Warrior("Goku", 20);
        Wizard merlino = new Wizard("Merlino", true, 35);
        Archer robin = new Archer("Robin Hood", 25);

        elements.add(goku);
        elements.add(merlino);
        elements.add(robin);

        for(Attackable e : elements){
            e.attackable();
        }

    }
}
