package ejercicioss13InterfacesFuncionalesPurasPredefinidas;

import java.util.Arrays;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class LambdaClass {

	int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };

	public static void main(String[] args) {
		new LambdaClass().show2();
	}

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

		showArray(number -> System.out.println(number));
		showArray((number, index) -> System.out.println(index + ": " + number));
		System.out.println(countArray(number -> number % 2 == 0));
		System.out.println(countArray(number -> number % 2 != 0));
		System.out.println(countArray(number -> number > 2));

		int[] arrayPares = filterArray(number -> number % 2 == 0);
		for (int number : arrayPares) {
			System.out.print(number + ", ");
		}
		System.out.println();

		int[] arrayImpares = filterArray(number -> number % 2 != 0);
		for (int number : arrayImpares) {
			System.out.print(number + ", ");
		}
		System.out.println();

		int[] mayoresA3 = filterArray(number -> number > 3);
		for (int number : mayoresA3) {
			System.out.print(number + ", ");
		}
		System.out.println();

	}

	public void show2() {
		showArray(System.out::println);
	}

}
