package ejercicios4RetornoDeArrays;

import java.util.Arrays;

public class Ejercicio3 {

    public static void main(String[] args) {
	new Ejercicio3().ejercicio3();
    }

    public void ejercicio3() {
	int[] array = { 1, 5, 6, 2, 3, 2, 100 };
	System.out.println(Arrays.toString(bubbleSort(array)));
    }

    public int[] bubbleSort(int[] array) {

	int aux;

	for (int i = 0; i < array.length - 1; i++) {
	    for (int j = 0; j < array.length - i - 1; j++) {
		if (array[j] > array[j + 1]) {
		    aux = array[j + 1];
		    array[j + 1] = array[j];
		    array[j] = aux;
		}
	    }

	}

	return array;
    }

}
