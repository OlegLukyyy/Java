package ejercicioss12ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Ejercicio1 {

    Scanner sc = new Scanner(System.in);
    List<Float> list = new ArrayList<Float>();
    ListIterator<Float> it = list.listIterator();
    boolean lastShown = false;

    public static void main(String[] args) {
	new Ejercicio1().show();
    }

    public void show() {
	boolean running = true;
	while (running) {
	    showMenu();
	    switch (askForOption()) {
	    case 1 -> showList();
	    case 2 -> showNext();
	    case 3 -> showPrevious();
	    case 4 -> addFloat();
	    case 5 -> removeLastShown();
	    case 6 -> replaceLastShown();
	    case 7 -> running = false;
	    default -> System.out.println("Opcion no válida");
	    }

	}
    }

    public void showMenu() {
	System.out.println("\n\n-------------------------------");
	System.out.println("1. Mostrar lista");
	System.out.println("2. Mostrar siguiente");
	System.out.println("3. Mostrar anterior");
	System.out.println("4. Añadir elemento");
	System.out.println("5. Eliminar el último mostrado");
	System.out.println("6. Sustituir el último mostrado");
	System.out.println("7. Salir");
	System.out.println("-------------------------------\n\n");

    }

    public int askForOption() {
	System.out.println("Introduce una opcion válida");
	int option = sc.nextInt();
	sc.nextLine();
	return option;

    }

    public float askForFloat() {
	System.out.println("Introduce un decimal válido");
	Float input = sc.nextFloat();
	sc.nextLine();
	return input;
    }

    public void showList() {
	int lastIndex;

	lastIndex = it.nextIndex();

	goBackward();
	while (it.hasNext()) {
	    System.out.println(it.next());
	}

	it = list.listIterator(lastIndex);
    }

    public void showNext() {
	if (it.hasNext()) {
	    System.out.println(it.next());
	} else {
	    goBackward();
	    System.out.println(it.next());
	}
	lastShown = true;
    }

    public void showPrevious() {
	if (it.hasPrevious()) {
	    System.out.println(it.previous());
	} else {
	    goForward();
	    System.out.println(it.previous());
	}
	lastShown = true;
    }

    public void addFloat() {
	float input = askForFloat();
	it.add(input);
    }

    public void removeLastShown() {
	if (lastShown) {
	    it.remove();
	    lastShown = false;
	} else {
	    System.out.println("No se ha mostrado ningun elemento que eliminar");
	}

    }

    public void replaceLastShown() {
	if (lastShown) {
	    it.set(askForFloat());
	    lastShown = false;

	} else {
	    System.out.println("No se ha mostrado ningun elemento que eliminar");
	}
    }

    public void goForward() {
	while (it.hasNext()) {
	    it.next();
	}

    }

    public void goBackward() {
	while (it.hasPrevious()) {
	    it.previous();
	}

    }

}
