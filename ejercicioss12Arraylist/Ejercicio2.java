package ejercicioss12Arraylist;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio2 {

	public static void main(String[] args) {
		new Ejercicio2().show();
	}

	public void show() {
		List<Integer> original = new ArrayList<>(List.of(1, 2, 3, 4, 5));
		List<Integer> invertida = invertir(original);

		System.out.println("Original:  " + String.join(", ", original.stream().map(String::valueOf).toList()));
		System.out.println("Invertida: " + String.join(", ", invertida.stream().map(String::valueOf).toList()));
	}

	public <T> List<T> invertir(List<T> list) {

		List<T> inverted = new ArrayList<T>();

		for (int i = list.size() - 1; i >= 0; i--) {
			inverted.add(list.get(i));
		}

		return inverted;

	}

}
