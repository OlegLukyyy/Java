package ejercicioss10Fechas;

import java.time.LocalDate;
import java.time.Year;

public class Ejercicio4 {
    public static void main(String[] args) {
	System.out.println(new Ejercicio4().esBisiesto("2025"));
    }

    public boolean esBisiesto(String anio) {

	LocalDate ld = LocalDate.now();
	Year year = Year.parse(anio);
	return (year.getValue() % 4 == 0 && year.getValue() % 100 != 0) || year.getValue() % 400 == 0;

    }

}
