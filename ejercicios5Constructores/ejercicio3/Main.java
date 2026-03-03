package ejercicios5Constructores.ejercicio3;

import java.util.Scanner;

public class Main {
    public void run() {
	Scanner scanner = new Scanner(System.in);

	System.out.print("Introduce matrícula: ");
	String matricula = scanner.nextLine();

	System.out.print("Introduce nombre: ");
	String nombre = scanner.nextLine();

	System.out.print("Introduce nota 1: ");
	float nota1 = scanner.nextFloat();

	System.out.print("Introduce nota 2: ");
	float nota2 = scanner.nextFloat();

	Student student = new Student(matricula, nombre);
	student.setMarks(nota1, nota2);

	System.out.println("\nDatos del alumno:\n" + student);
    }

    public static void main(String[] args) {
	new Main().run();
    }
}
