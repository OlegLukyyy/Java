package ejercicios4RetornoDeArrays;

import java.util.Arrays;

public class Ejercicio2 {

    public static void main(String[] args) {
	new Ejercicio2().ejercicio2();
    }

    public void ejercicio2() {
	int[] array = { 1, 5, 6, 2, 3, 2 };
	System.out.println(Arrays.toString(invert(array)));
    }

    public int[] invert(int[] array) {
	int aux = 0;

	for (int i = 0; i < array.length / 2; i++) {

	    aux = array[i];
	    array[i] = array[array.length - 1 - i];
	    array[array.length - 1 - i] = aux;

	}
	return array;
    }

}
