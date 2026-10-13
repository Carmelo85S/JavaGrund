package org.java26.week7.monday.ex1G;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Du har en List<Warrior> team. Varje Warrior har ett HP-värde. Skriv ut hur många i teamet som fortfarande
        //är stridsdugliga, alltså har HP över noll. Lös det utan att skriva en egen räknarloop — beskriv i stället vad du vill ha
        //ut ur listan: filtrera fram dem med HP kvar och ta reda på antalet.

        Warrior goku = new Warrior("Goku", 300);
        Warrior vegeta = new Warrior("Vegeta", 0);
        Warrior krillin = new Warrior("Krillin", 0);
        Warrior trunks = new Warrior("Trunks", 200);

        List<Warrior> team = new ArrayList<>();
        team.add(goku);
        team.add(vegeta);
        team.add(krillin);
        team.add(trunks);

        long hpOverNoll = team.stream()
                .filter( w -> w.getMaxHp() > 0)
                .count();

        System.out.println(hpOverNoll);

    }
}
