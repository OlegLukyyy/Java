package ejercicioss10Fechas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateConverter {

    DateTimeFormatter spanish = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    DateTimeFormatter american = DateTimeFormatter.ofPattern("MM/dd/yyyy");

    public static void main(String[] args) {
	new DateConverter().show();
    }

    void show() {
	System.out.println(spanishToAmerican("12/10/2025"));
	System.out.println(americanToSpanish("01/20/2025"));
    }

    String spanishToAmerican(String spanish) {

	LocalDate date = LocalDate.parse(spanish, this.spanish);

	return date.format(american).toString();
    }

    String americanToSpanish(String american) {

	LocalDate date = LocalDate.parse(american, this.american);

	return date.format(spanish).toString();
    }

}
