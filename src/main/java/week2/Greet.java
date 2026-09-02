package week2;

public class Greet {
    public static void main(String[] args) {
        //Skriv en metod som tar emot ett namn och skriver ut en hälsning.
        // Den här metoden returnerar inget — den gör
        //bara något. Anropa den med tre olika namn från main.


        greetUser("Carmelo");
        greetUser("Angelica");
        greetUser("Isabella & Alexander");
    }

    public static void greetUser(String name){
        System.out.println("Hello "+ name);
    }

}
