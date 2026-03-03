package ejercicios9ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {

    public static void main(String[] args) {
	String cadena = "int->byte double->float";

	Pattern pattern = Pattern.compile("int");
	Matcher matcher = pattern.matcher(cadena);
	cadena = matcher.replaceAll("byte");

	pattern = Pattern.compile("double");
	matcher = pattern.matcher(cadena);
	cadena = matcher.replaceAll("float");

	System.out.println(cadena);

    }

}
