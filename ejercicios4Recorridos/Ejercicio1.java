package ejercicios4Recorridos;

public class Ejercicio1 {

    public static void main(String[] args) {
	new Ejercicio1().showEvenNumbers();
    }

    public void showEvenNumbers() {

	int[] array = { 5, 2, 3, 4, 5, 6 };

	for (int i = 0; i < array.length; i++) {

	    System.out.printf("Posición %d: %s \n", i, array[i] % 2 == 0 ? "Par" : "Impar");

	}

    }

}
