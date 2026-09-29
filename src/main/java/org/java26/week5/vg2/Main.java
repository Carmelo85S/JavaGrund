package org.java26.week5.vg2;

public class Main {
    public static void main(String[] args) {
        //Just nu är typen lätt att skriva fel — "Electric", "electic" och "Banan" är alla giltiga strängar. Skapa i stället en egen
        //typ, en enum Type, som räknar upp de tillåtna värdena: Fire, Water, Grass, Electric och Normal. Låt fältet type i
        //Pokemon ha den typen.
        //Visa att ett giltigt värde fungerar. Försök sedan sätta ett värde som inte finns i din enum och notera vad som
        //händer redan innan programmet körs.
        //Körningsexempel:
        //Charizard är av typen FIRE
        //(ett påhittat värde, t.ex. Type.BANAN,
        //går inte att kompilera — felet fångas direkt)

        Pokemon charizard = new Pokemon("Charizard", Type.valueOf("FIRE")); //fel typ kör inte
        System.out.println(charizard);
    }
}
