package week3;

import java.util.HashMap;
import java.util.Scanner;

public class GetOrDefault {
    public static void main(String[] args) {
        //You have a HashMap<String, Integer> that maps a player's name to a score.
        // Add a few players manually. Ask the user for a name and display that player's score.
        // If the name does not exist in the map, the program should not crash.
        // Instead, display a message saying that the player is missing.
        // Keep in mind that a lookup that fails does not automatically produce an error.
        // It can return an empty (null) value that only causes an error later.

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> player = new HashMap<>();
        player.put("Carmelo", 25);
        player.put("Angelica", 35);
        player.put("Alexander", 12);
        player.put("Isabella", 22);

        System.out.println("Enter a name and i show you the score");
        String playerName = scanner.nextLine().trim();

        Integer score = player.getOrDefault(playerName, -1);
        if (score == -1) {
            System.out.println("Player is missing");
        }else {
            System.out.println("Score: " + score);
        }
    }
}
