package ejercicios9ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {

    public static void main(String[] args) {
	String cadena = "package ejercicios9ExpresionesRegulares;\r\n" + "\r\n" + "import java.util.regex.Matcher;\r\n"
		+ "import java.util.regex.Pattern;\r\n" + "\r\n" + "public class Ejercicio2 {\r\n";

	Pattern pattern = Pattern.compile("import\\s([\\w\\.]+)");
	Matcher matcher = pattern.matcher(cadena);

	while (matcher.find()) {
	    System.out.println(matcher.group(1));
	}

    }

}
