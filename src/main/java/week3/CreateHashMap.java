package week3;

import java.util.HashMap;

public class CreateHashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> nameAge = new HashMap<>();
        nameAge.put("Carmelo", 41);
        nameAge.put("Angelica", 36);
        nameAge.put("Isabella", 5);
        nameAge.put("Alexander", 4);

        System.out.println("All name and ages");
        for (var entry : nameAge.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("All names");
        for (String key : nameAge.keySet()) {
            System.out.println(key);
        }

        System.out.println("All ages");
        for (Integer value : nameAge.values()) {
            System.out.println(value);
        }

        System.out.println("Only one");
        System.out.println("Angelica is "+ nameAge.get("Angelica") + " years old");

        //Add
        nameAge.put("Marcolino", 88);
        System.out.println("Marcolino age: "+ nameAge.get("Marcolino"));

        System.out.println("Name age contains: "+ nameAge.containsKey("Angelica"));
        System.out.println("Remove Carmelo: "+ nameAge.remove("Carmelo"));

        System.out.println("All name and ages");
        for (var entry : nameAge.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
