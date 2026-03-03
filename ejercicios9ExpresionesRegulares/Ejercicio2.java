package ejercicios9ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {

    public static void main(String[] args) {

	String text = "package ejercicios7Interfaces.ejercicio1;\r\n" + "\r\n"
		+ "public class Alumno extends Persona implements GestionAlumno {\r\n" + "\r\n" + "    // CLASE\r\n"
		+ "    protected static int indexStudent = 1;";

	Pattern pattern = Pattern.compile("package\\s([\\w\\.]+)");
	Matcher matcher = pattern.matcher(text);

	while (matcher.find()) {
	    System.out.println(matcher.group(1));
	}

    }

}
