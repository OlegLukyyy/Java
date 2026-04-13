package ejercicioss13InterfacesFuncionalesPurasPredefinidas;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class AnonimClass {

	public static void main(String[] args) {
		new AnonimClass().show();
	}

	int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };

	public void showArray(Consumer<Integer> consumer) {
		for (int number : array) {
			consumer.accept(number);
		}

	}

	public void showArray(BiConsumer<Integer, Integer> biconsumer) {

		for (int i = 0; i < array.length; i++) {
			biconsumer.accept(array[i], i);
		}

	}

	public int countArray(Predicate<Integer> predicate) {

		int counter = 0;

		for (int number : array) {

			if (predicate.test(number)) {
				counter++;
			}

		}

		return counter;
	}

	public int[] filterArray(Predicate<Integer> predicate) {
		int[] filteredArray = new int[array.length];
		int arrayIndex = 0;

		for (int number : array) {

			if (predicate.test(number)) {
				filteredArray[arrayIndex] = number;
				arrayIndex++;
			}

		}

		return Arrays.copyOf(filteredArray, arrayIndex);

	}

	public int[] transformArray(UnaryOperator<Integer> unaryOper) {

		int[] transformedArray = new int[array.length];

		for (int i = 0; i < array.length; i++) {
			transformedArray[i] = unaryOper.apply(array[i]);
		}

		return transformedArray;

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

		int[] arrayPares = filterArray(esPar);
		for (int i : arrayPares) {
			System.out.print(i + ", ");
		}
		System.out.println();

		int[] arrayImpares = filterArray(esImpar);
		for (int i : arrayImpares) {
			System.out.print(i + ", ");
		}
		System.out.println();

		int[] arrayMayores = filterArray(esMayorA3);
		for (int i : arrayMayores) {
			System.out.print(i + ", ");
		}
		System.out.println();

		UnaryOperator<Integer> duplicar = new UnaryOperator<Integer>() {
			public Integer apply(Integer number) {
				return number * 2;
			}
		};
		int[] arrayDuplicado = transformArray(duplicar);
		for (int i : arrayDuplicado) {
			System.out.print(i + ", ");
		}
		System.out.println();
		UnaryOperator<Integer> triplicar = new UnaryOperator<Integer>() {
			public Integer apply(Integer number) {
				return number * 3;
			}
		};

		int[] arrayTrilicado = transformArray(triplicar);
		for (int i : arrayTrilicado) {
			System.out.print(i + ", ");
		}

	}

}