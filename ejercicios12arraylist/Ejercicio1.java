package ejercicios12arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {

	private List<Integer> enteros = new ArrayList<Integer>();

	public static void main(String[] args) {

		new Ejercicio1().show();

	}

	public void show() {
		leerNumeros();
		double media = calcularMedia();
		System.out.printf("Media: %.2f%n", media);
		System.out.print("Inferiores a la media: ");
		mostrarInferioresA(media);

	}

	public void leerNumeros() {
		Scanner sc = new Scanner(System.in);
		boolean completo = false;
		while (!completo) {
			System.out.println("introduce un numero");
			enteros.add(sc.nextInt());
			if (enteros.size() == 10) {
				completo = true;
			}
		}
	}

	public void mostrarInferioresA(Double media) {

		for (int numero : enteros) {
			if (numero < media) {
				mostrarNumero(numero);

			}
		}

	}

	private int obtenerSuma() {
		int suma = 0;
		for (int numero : enteros) {
			suma += numero;
		}
		return suma;
	}

	public double calcularMedia() {
		return obtenerSuma() / 10;
	}

	public void mostrarNumero(Integer numero) {

		System.out.printf("%d", numero);

	}

}
