package org.java26.week7.monday.ex1G;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //Du har en List<Warrior> team. Varje Warrior har ett HP-värde. Skriv ut hur många i teamet som fortfarande
        //är stridsdugliga, alltså har HP över noll. Lös det utan att skriva en egen räknarloop — beskriv i stället vad du vill ha
        //ut ur listan: filtrera fram dem med HP kvar och ta reda på antalet.

        Warrior goku = new Warrior("Goku", 300);
        Warrior vegeta = new Warrior("Vegeta", 299);
        Warrior krillin = new Warrior("Krillin", 100);
        Warrior trunks = new Warrior("Trunks", 200);

        List<Warrior> team = new ArrayList<>();
        team.add(goku);
        team.add(vegeta);
        team.add(krillin);
        team.add(trunks);


        long hpOverNoll = team.stream()
                .filter( w -> w.getCurrentHp() > 0)
                .count();

        System.out.println("Redö för battle : " + hpOverNoll);

        //Bygg en List<String> med namnen på alla som har HP över noll,
        //sorterade i bokstavsordning, och skriv ut dem.

        List<String> names = team.stream()
                .filter(w-> w.getCurrentHp() > 0)
                .map(Warrior::getName)
                .sorted()
                .toList();

        System.out.println(names);

        Warrior beerus = new Warrior("Beerus", 400);
        team.add(beerus);
        //Ta reda på det högsta HP-värdet i team och skriv ut det. Tänk på att teamet kan vara tomt — då finns inget
        //högsta värde att visa, och programmet ska säga det i stället för att krascha.

        Optional<Integer> highestHp = team.stream()
                .map(Warrior::getCurrentHp)
                .max(Integer::compareTo);

        if (highestHp.isPresent()) {
            System.out.println("Highest HP: " + highestHp.get());
        } else {
            System.out.println("Team is empty.");
        }
    }
}
