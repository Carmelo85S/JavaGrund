package org.java26.week5.g5;

public class Main {
    public static void main(String[] args) throws IllegalArgumentException{
        //Bygg ut constructorn så att den vägrar skapa en pokémon med tomt namn eller med max-HP som inte är större
        //än noll. I stället för att skapa ett trasigt objekt ska den signalera ett fel.
        //I main: skapa ett giltigt objekt, och försök sedan skapa ett med tomt namn och ett med negativ HP. Programmet
        //ska inte krascha — fånga felet, skriv ett begripligt meddelande och fortsätt.
        //Körningsexempel:
        //OK: Bulbasaur (45/45 HP)
        //Kunde inte skapa pokémon: namn får inte vara tomt
        //Kunde inte skapa pokémon: max-HP måste vara > 0
        //Programmet fortsätter.



        try{
            Pokemon pokemon1 = new Pokemon("Bulbasaur", 45, Type.GRASS);
            System.out.println(pokemon1);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        try {
            Pokemon pokemon2 = new Pokemon("", 45, Type.GRASS);
            System.out.println(pokemon2);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        try {
            Pokemon pokemon3 = new Pokemon("Butterfly", -45, Type.GRASS);
            System.out.println(pokemon3);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
