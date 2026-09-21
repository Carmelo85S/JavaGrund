package org.java26.week4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class FirstFile {
    public static void main(String[] args) {
        // Add 3 things and save them in a file
        ArrayList<String> list = new ArrayList<>();

        list.add("Orologio");
        list.add("Auto");
        list.add("Lego");

        Path path = Path.of("favorite.txt");

        try {
            if(Files.exists(path)){
                String data = Files.readString(path);
                System.out.println(data);
                System.out.println("Full path: " + path.toAbsolutePath());
            }else{
                System.out.println("No data saved.");
            }
            Files.write(path, list);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}