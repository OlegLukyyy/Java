package ejercicioss13InterfacesFuncionalesPurasPredefinidas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class AnonimClassList {
	public static void main(String[] args) {
		new AnonimClassList().show();
	}

	List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

	public void showArray(Consumer<Integer> consumer) {
		for (int number : list) {
			consumer.accept(number);
		}

	}

	public void showArray(BiConsumer<Integer, Integer> biconsumer) {

		for (int i = 0; i < list.size(); i++) {
			biconsumer.accept(list.get(i), i);
		}

	}

	public int countArray(Predicate<Integer> predicate) {

		int counter = 0;

		for (int number : list) {

			if (predicate.test(number)) {
				counter++;
			}

		}

		return counter;
	}

	public List<Integer> filterArray(Predicate<Integer> predicate) {
		List<Integer> filtered = new ArrayList<Integer>();

		for (int number : list) {
			if (predicate.test(number)) {
				filtered.add(number);
			}
		}
		return filtered;

	}

	public List<Integer> transformArray(UnaryOperator<Integer> unaryOper) {

		List<Integer> filtered = new ArrayList<Integer>();

		for (int i = 0; i < list.size(); i++) {
			filtered.add(unaryOper.apply(list.get(i)));
		}

		return filtered;

	}

	public void show() {

		showArray(new Consumer<Integer>() {
			public void accept(Integer number) {
				System.out.println(number);
			};
		});

		showArray(new BiConsumer<Integer, Integer>() {
			public void accept(Integer number, Integer index) {
				System.out.println(index + ": " + number);
			};
		});
		Predicate<Integer> esPar = new Predicate<Integer>() {
			public boolean test(Integer number) {
				return number % 2 == 0;
			}
		};
		Predicate<Integer> esImpar = new Predicate<Integer>() {
			public boolean test(Integer number) {
				return number % 2 != 0;
			}
		};
		Predicate<Integer> esMayorA3 = new Predicate<Integer>() {
			public boolean test(Integer number) {
				return number > 3;
			}
		};
		int pares = countArray(esPar);
		System.out.println("Pares: " + pares);

		int impares = countArray(esImpar);
		System.out.println("Impares: " + pares);

		int mayorA3 = countArray(esMayorA3);
		System.out.println("Mayores a 3: " + mayorA3);

		List<Integer> arrayPares = filterArray(esPar);
		for (int i : arrayPares) {
			System.out.print(i + ", ");
		}
		System.out.println();

		List<Integer> arrayImpares = filterArray(esImpar);
		for (int i : arrayImpares) {
			System.out.print(i + ", ");
		}
		System.out.println();

		List<Integer> arrayMayores = filterArray(esMayorA3);
		for (int i : arrayMayores) {
			System.out.print(i + ", ");
		}
		System.out.println();

		UnaryOperator<Integer> duplicar = new UnaryOperator<Integer>() {
			public Integer apply(Integer number) {
				return number * 2;
			}
		};
		List<Integer> arrayDuplicado = transformArray(duplicar);
		for (int i : arrayDuplicado) {
			System.out.print(i + ", ");
		}
		System.out.println();
		UnaryOperator<Integer> triplicar = new UnaryOperator<Integer>() {
			public Integer apply(Integer number) {
				return number * 3;
			}
		};

		List<Integer> arrayTrilicado = transformArray(triplicar);
		for (int i : arrayTrilicado) {
			System.out.print(i + ", ");
		}

	}
}
