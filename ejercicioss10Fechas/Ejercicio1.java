package ejercicioss10Fechas;

import java.time.LocalDate;
import java.time.Month;

public class Ejercicio1 {

    public static void main(String[] args) {
	LocalDate ld = LocalDate.of(2024, Month.DECEMBER, 31);
	System.out.println(ld.getDayOfWeek());

    }

}
