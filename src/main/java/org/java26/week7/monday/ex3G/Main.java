package org.java26.week7.monday.ex3G;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;

public class Main {
    public static void main(String[] args) {
        //Skriv ut dagens datum med Javas nya tidsbibliotek (det som infördes i Java 8 — inte de gamla, buggiga
        //datumklasserna). Formatera det som ÅÅÅÅ-MM-DD.

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        DateTimeFormatter nowDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String newDate = localDate.format(nowDate);
        System.out.println(newDate);


        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter nowDateTime = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newFormattedDate = localDateTime.format(nowDateTime);
        System.out.println(newFormattedDate);
    }
}
