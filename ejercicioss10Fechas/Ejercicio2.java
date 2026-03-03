package ejercicioss10Fechas;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Ejercicio2 {

    public static void main(String[] args) {
	LocalDate date = LocalDate.of(2026, Month.FEBRUARY, 27);
	LocalDate fistDayOfYear = LocalDate.of(2026, Month.JANUARY, 1);
	System.out.println(ChronoUnit.DAYS.between(fistDayOfYear, date));
    }

}
