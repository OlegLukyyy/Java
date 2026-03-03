package ejercicioss10Fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio3 {

    public static void main(String[] args) {
	String fecha = "2025-03-21";
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	try {
	    LocalDate.parse(fecha, formatter);
	    System.out.print("si ");
	} catch (Exception e) {
	    System.out.print("no ");
	}
	System.out.println("es válida");
    }

}
