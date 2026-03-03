package ejercicios9ExpresionesRegulares;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio7 {

    public static void main(String[] args) {
	String cadena = "Ecuaciones de primer grado con una incógnita. Veamos algunos ejemplos válidos y no válidos: \r\n"
		+ "\r\n" + "Ejercicio1: x=3+13\r\n" + "\r\n" + "Ejercicio2: 8+70=x\r\n" + "\r\n"
		+ "Ejercicio3: -x+2=x-8\r\n" + "\r\n" + "Ejercicio4: x-1+x+3=2+x+8-x\r\n" + "\r\n"
		+ "Ejercicio5: +4+x-3-x+1+x=x+x+x-1-1\r\n" + "\r\n" + "No vale: ++x-3=x+6\r\n" + "\r\n"
		+ "No vale: x++5=8+x\r\n" + "\r\n" + "No vale: x=--x\r\n" + "\r\n" + "No vale: 3-1+x=-4+6--x\r\n"
		+ "\r\n" + "No vale: 3x+5=11\r\n" + "\r\n" + "No vale: x-3=2x-8";

	Pattern pattern = Pattern.compile("[+-]?(x|\\d+)([+-](x|\\d+))*=[+-]?(x|\\d+)([+-](x|\\d+))*");
	Matcher matcher = pattern.matcher(cadena);

	while (matcher.find()) {
	    System.out.println(matcher.group(0));
	}
    }

}
