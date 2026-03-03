package ejercicios4Recorridos;

public class Ejercicio2 {

    public static void main(String[] args) {
	new Ejercicio2().ejercicio2();
    }

    public void ejercicio2() {

	boolean b = false;
	int[] array = { 1, 2, 3, 4, 5, 6, 7 };

	for (int i = 0; i < array.length; i++) {

	    if (b && i % 2 == 0) {
		System.out.printf("Posición %d -> %d\n", i, array[i]);
	    } else if (!b && i % 2 != 0) {
		System.out.printf("Posición %d -> %d\n", i, array[i]);
	    }

	}

    }

}
