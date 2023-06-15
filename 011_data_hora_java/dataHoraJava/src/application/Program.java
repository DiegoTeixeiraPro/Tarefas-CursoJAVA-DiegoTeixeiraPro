package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        LocalDate dt01 = LocalDate.now();
        LocalDateTime dt02 = LocalDateTime.now();
        Instant dt03 = Instant.now();


        LocalDate dt04 = LocalDate.parse("2023-06-15");
        LocalDateTime dt05 = LocalDateTime.parse("2023-06-15T01:30:26");
        Instant dt06 = Instant.parse("2023-06-15T01:30:26Z");
        Instant dt07 = Instant.parse("2023-06-15T01:30:26-03:00");


        LocalDate dt08 = LocalDate.parse("15/06/2023", format1);
        LocalDateTime dt09 = LocalDateTime.parse("15/06/2023 01:30", format2);


        LocalDate dt10 = LocalDate.of(2023, 6, 15);
        LocalDateTime dt11 = LocalDateTime.of(2023, 6, 15, 1, 30);


        System.out.println("Data = " + dt01);
        System.out.println("Data = " + dt02);
        System.out.println("Data = " + dt03);
        System.out.println("Data = " + dt04);
        System.out.println("Data = " + dt05);
        System.out.println("Data = " + dt06);
        System.out.println("Data = " + dt07);
        System.out.println("Data = " + dt08);
        System.out.println("Data = " + dt09);
        System.out.println("Data = " + dt10);
        System.out.println("Data = " + dt11);
    }
}