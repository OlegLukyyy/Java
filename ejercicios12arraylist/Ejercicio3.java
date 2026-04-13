package ejercicios12arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio3 {

	Scanner sc = new Scanner(System.in);
	List<String> list = new ArrayList<String>();

	public static void main(String[] args) {
		new Ejercicio3().show();
	}

	public void show() {
		boolean running = true;
		while (running) {
			showMenu();
			switch (askForOption()) {
			case 1 -> resetList();
			case 2 -> showLength();
			case 3 -> insertString();
			case 4 -> deleteLastString();
			case 5 -> containsString();
			case 6 -> showList();
			case 7 -> running = false;
			default -> System.out.println("Opcion no válida");
			}

		}
	}

	public void showMenu() {
		System.out.println("\n\n-------------------------------");
		System.out.println("1. Nueva lista");
		System.out.println("2. Número de cadenas");
		System.out.println("3. Añadir cadena");
		System.out.println("4. Eliminar última cadena");
		System.out.println("5. Contiene cadena");
		System.out.println("6. Mostrar lista entera");
		System.out.println("7. Salir");
		System.out.println("-------------------------------\n\n");

	}

	public int askForOption() {
		System.out.println("Introduce una opcion válida");
		int option = sc.nextInt();
		sc.nextLine();
		return option;

	}

	public String askForString() {
		System.out.println("Introduce una cadena válida");
		String input = sc.nextLine();
		return input.trim();
	}

	public void resetList() {
		list.clear();
		System.out.println("Lista nueva creada");
	}

	public void showLength() {
		System.out.printf("La lista contiene %d cadenas", list.size());
	}

	public void insertString() {
		String input = askForString();
		list.add(input);
		System.out.printf("La cadena %s ha sido añadida correctamente", input);
	}

	public void deleteLastString() {
		list.removeLast();
		System.out.println("La última cadena ha sido eliminada correctamente");
	}

	public void containsString() {
		String input = askForString();

		System.out.printf("La cadena %s %s existe en la lista", input, list.contains(input) ? "si" : "no");

	}

	public void showList() {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			if (i < list.size() - 1) {
				System.out.print(", ");
			}
		}
	}

}
