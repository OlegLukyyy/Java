package ejercicios5GetYSet.ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	Person person = new Person();
	person.setName("Juan");
	person.setAge(20);
	person.setHeight(1.75f);
	person.setWork("Estudiante");

	System.out.println("Datos actuales:\nNombre: " + person.getName() + "\nEdad: " + person.getAge() + "\nAltura: "
		+ person.getHeight() + "\nTrabajo: " + person.getWork());

	System.out.println("\nIntroduce nuevos datos:");
	person.setName(scanner.nextLine());
	person.setAge(scanner.nextInt());
	person.setHeight(scanner.nextFloat());
	scanner.nextLine();
	person.setWork(scanner.nextLine());

	System.out.println("\nDatos actualizados:\nNombre: " + person.getName() + "\nEdad: " + person.getAge()
		+ "\nAltura: " + person.getHeight() + "\nTrabajo: " + person.getWork());
    }
}
