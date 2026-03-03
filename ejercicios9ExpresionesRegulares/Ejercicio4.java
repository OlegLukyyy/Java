package ejercicios9ExpresionesRegulares;

//hola que pasa
//que pasooo
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio4 {

    public static void main(String[] args) {

	String cadena = "package ejercicios9ExpresionesRegulares;\r\n" + "\r\n" + "//hola que pasa\r\n"
		+ "//que pasooo\r\n" + "import java.util.regex.Matcher;\r\n" + "import java.util.regex.Pattern;";

	Pattern pattern = Pattern.compile("//(.+)");
	Matcher matcher = pattern.matcher(cadena);

	while (matcher.find()) {
	    System.out.println(matcher.group(1));
	}

    }

}
