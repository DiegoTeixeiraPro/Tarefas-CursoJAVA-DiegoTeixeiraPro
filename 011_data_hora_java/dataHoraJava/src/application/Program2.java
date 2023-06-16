package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program2 {
    public static void main(String[] args) {
        LocalDate dt01 = LocalDate.parse("2023-06-15");
        LocalDateTime dt02 = LocalDateTime.parse("2023-06-15T22:30:00");
        Instant dt03 = Instant.parse("2023-06-15T22:31:00Z");

        LocalDate pastWeekDate = dt01.minusDays(7);
        LocalDate nextWeekDate = dt01.plusDays(7);

        LocalDateTime pastWeekLocalDate = dt02.minusDays(7);
        LocalDateTime nextWeekLocalDate = dt02.plusDays(7);

        Instant pastWeekInstant = dt03.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = dt03.plus(7, ChronoUnit.DAYS);

        System.out.println();
        System.out.println("Data da semana passada = " + pastWeekDate); // data
        System.out.println("Data da próxima semana = " + nextWeekDate);

        System.out.println();
        System.out.println("Data da semana passada - local = " + pastWeekLocalDate);
        System.out.println("Data da próxima semana - local = " + nextWeekLocalDate);

        System.out.println();
        System.out.println("Semana passada - instante = " + pastWeekInstant);
        System.out.println("Próxima semana - instante = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekDate.atStartOfDay(), dt01.atStartOfDay());
        Duration t2 = Duration.between(pastWeekLocalDate, dt02);
        Duration t3 = Duration.between(pastWeekInstant, dt03);
        Duration t4 = Duration.between(dt03, pastWeekInstant);

        System.out.println();
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
        System.out.println("t3 dias = " + t3.toDays());
        System.out.println("t4 dias = " + t4.toDays());
    }
}