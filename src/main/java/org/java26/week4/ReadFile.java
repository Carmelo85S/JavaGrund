package org.java26.week4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadFile {
    public static void main(String[] args) {
        //Skriv ett program som ska läsa notes.txt och skriva ut innehållet, men bara om filen finns. Saknas filen
        //ska programmet i stället skriva ett vänligt meddelande och avsluta lugnt. Inget får krascha. Testa båda fallen:
        //kör en gång när filen finns och en gång när den inte gör det.
        Path path = Path.of("note.txt");
        try{
            if(Files.exists(path)){
                List<String> note = Files.readAllLines(path);
                for(int i = 0; i < note.size(); i++){
                    System.out.println(note.get(i));
                }
            } else{
                System.out.println("File does not exist");
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
