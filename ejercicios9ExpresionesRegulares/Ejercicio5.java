package ejercicios9ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {

    public static void main(String[] args) {

	String cadena = "Matcher matcher = pattern.matcher(cadena);\r\n" + "\r\n" + "	while (matcher.find()) {\r\n"
		+ "	    System.out.println(matcher.group(1));\r\n" + "	}";

	Pattern pattern = Pattern.compile("while\\s*\\((.*)\\)");
	Matcher matcher = pattern.matcher(cadena);

	while (matcher.find()) {
	    System.out.println(matcher.group(1));
	}

    }

}
