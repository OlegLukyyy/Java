package ejercicios4ArraysComoParametros;

import java.util.Arrays;

public class Ejercicio6 {

    public static void main(String[] args) {

	int[] array = { 2, 3, 3, 3, 2 };
	System.out.println(new Ejercicio6().ejercicio6(array));

    }

    public boolean ejercicio6(int[] array) {

	if (array.length <= 1) {
	    return true;
	} else if (array[0] == array[array.length - 1]) {
	    return ejercicio6(Arrays.copyOfRange(array, 1, array.length - 1));
	} else {
	    return false;
	}

    }

}
