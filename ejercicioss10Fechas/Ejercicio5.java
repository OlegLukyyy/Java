package ejercicioss10Fechas;

import java.time.LocalDate;
import java.time.Period;

public class Ejercicio5 {

    public static void main(String[] args) {
	LocalDate date = LocalDate.of(2006, 06, 13);
	new Ejercicio5().getAge(date);

    }

    void getAge(LocalDate fecha) {

	LocalDate currentDate = LocalDate.now();
	int years = Period.between(fecha, currentDate).getYears();

	System.out.println(years);
    }
}
/*
 * 
 * if (currentDate.getMonthValue() < fecha.getMonthValue()) {
 * 
 * } else if (currentDate.getMonthValue() == fecha.getMonthValue() &&
 * currentDate.getDayOfMonth() < fecha.getDayOfMonth()) {
 * 
 * } else {
 * 
 * }
 * 
 */