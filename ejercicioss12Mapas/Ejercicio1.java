package ejercicioss12Mapas;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Ejercicio1 {

	Map<Libro, Integer> historial = new HashMap<Libro, Integer>();

	public static void main(String[] args) {
		new Ejercicio1().run();
	}

	public void run() {
		Libro lib1 = new Libro(1, "Demonio Blanco", "Oleh");
		registrar(lib1);
		registrar(lib1);
		Libro lib2 = new Libro(2, "Perro negro", "Marcos");
		registrar(lib2);
		show();

	}

	public void show() {
		for (Libro libro : historial.keySet()) {
			System.out.println(libro);
		}
		for (Integer prestaciones : historial.values()) {
			System.out.println(prestaciones);
		}
		for (Entry<Libro, Integer> entrada : historial.entrySet()) {
			System.out.println(entrada);
		}

		mostrarLibro(1);
		eliminarLibro(1);
	}

	public void registrar(Libro libro) {
		if (historial.containsKey(libro)) {
			historial.replace(libro, historial.get(libro) + 1);
		} else {
			historial.put(libro, 1);
		}

	}

	public void mostrarLibro(int isbn) {

		for (Entry<Libro, Integer> entrada : historial.entrySet()) {
			if (entrada.getKey().isbn == isbn) {
				System.out.println("El libro se ha prestado " + entrada.getValue() + " veces");
			}

		}

	}

	public void eliminarLibro(int isbn) {

		Iterator<Entry<Libro, Integer>> it = historial.entrySet().iterator();

		while (it.hasNext()) {
			Entry<Libro, Integer> entrada = it.next();
			if (entrada.getKey().getIsbn() == isbn) {
				it.remove();
				System.out.println("Libro eliminado correctamente.");
				return;
			}
		}

	}

}
