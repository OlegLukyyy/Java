package ejercicioss10Fechas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class Ejercicio6 {

    public static void main(String[] args) {
	System.out.println(new Ejercicio6().momentoActual());
    }

    String momentoActual() {

	LocalDateTime date = LocalDateTime.now();
	String diaSemana = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("es"));
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("'Hoy es' EEEE dd-MMMM-yyyy 'a las' HH:mm:ss");

	return formatter.format(date);

    }

}
