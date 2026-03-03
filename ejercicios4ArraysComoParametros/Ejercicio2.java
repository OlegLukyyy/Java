package ejercicios4ArraysComoParametros;

import java.util.Arrays;

public class Ejercicio2 {

    public static void main(String[] args) {

	// MODIFICA EL ARRAY ORIGINAL

	new Ejercicio2().ejercicio2();

    }

    public void modArray(int[] array) {
	array[2] = 5;
    }

    public void ejercicio2() {

	int array[] = { 1, 2, 3 };
	System.out.println(Arrays.toString(array));
	modArray(array);
	System.out.println(Arrays.toString(array));
    }

}
