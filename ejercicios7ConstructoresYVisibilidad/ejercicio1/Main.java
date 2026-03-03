package ejercicios7ConstructoresYVisibilidad.ejercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	new Main().show();

    }

    public void show() {
	String choice;
	Persona persona = null;

	Profesor profesor = new Profesor();
	System.out.println(profesor);
	Alumno alumno = new Alumno();

	Scanner scanner = new Scanner(System.in);
	System.out.println("Introduce \"p\" para crear un profesor o \"a\" para crear a in alumno");

	do {
	    choice = scanner.nextLine();
	    if (choice.equals("p")) {
		persona = new Profesor();
	    } else if (choice.equals("a")) {
		persona = new Alumno();
	    } else {
		System.out.println("la eleccion no es valida");
	    }
	} while (!choice.equals("p") && !choice.equals("a"));

	System.out.println(persona);

    }
}
