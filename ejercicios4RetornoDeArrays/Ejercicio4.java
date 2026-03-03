package ejercicios4RetornoDeArrays;

import java.util.Arrays;

public class Ejercicio4 {

    public static void main(String[] args) {
	new Ejercicio4().ejercicio4();
    }

    public void ejercicio4() {
	int[] array = { 1, 5, 6, 2, 3, 2, 100 };
	System.out.println(Arrays.toString(invertArray(array, 0)));
    }

    public int[] invertArray(int[] array, int i) {
	int aux;
	if (array.length / 2 == i) {
	    return array;
	}

	aux = array[i];
	array[i] = array[array.length - i - 1];
	array[array.length - i - 1] = aux;
	return invertArray(array, i + 1);

    }

}
