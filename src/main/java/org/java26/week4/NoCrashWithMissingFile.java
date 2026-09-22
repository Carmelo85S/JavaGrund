package org.java26.week4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class NoCrashWithMissingFile {
    public static void main(String[] args) {
        //Skriv ett program som försöker läsa en fil som garanterat inte finns, t.ex. does-not-exist.txt. När
        //läsningen misslyckas ska programmet fånga felet och skriva ett begripligt meddelande i stället för att krascha
        //med en röd stacktrace. Programmet ska sedan avsluta normalt.
        Path path = Path.of("does-not-exist.txt");
        try {
            List<String> content = Files.readAllLines(path);
            System.out.println(content);
        }catch (IOException e){
            System.out.println("Cant load file");
        }
    }
}
