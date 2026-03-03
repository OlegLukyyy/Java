package ejercicios4ArraysComoParametros;

public class Ejercicio5 {

    public static void main(String[] args) {

	int[] array = { 6, 4, 4, 1, 9, 7, 5, 6, 4, 2, 3, 9, 5, 6, 4 };
	new Ejercicio5().drawHistogram(array);
    }

    public void drawHistogram(int[] array) {

	int[] aux = new int[10];
	int maxValue = 0;

	// NUMERO DE APARICIONES
	for (int i = 0; i < array.length; i++) {
	    aux[array[i]]++;

	}

	// VALOR MAXIMO DE APARICIONES
	for (int i = 0; i < aux.length; i++) {
	    if (aux[i] > maxValue) {
		maxValue = aux[i];
	    }
	}

	// IMPRIMIR
	for (int i = maxValue; i >= 0; i--) {
	    for (int j = 0; j < 10; j++) {
		if (aux[j] >= i) {
		    System.out.print("* ");
		} else {
		    System.out.print("  ");
		}

	    }
	    System.out.println();

	}

	// FILA INFERIOR
	for (int i = 0; i < 10; i++) {
	    System.out.print(i + " ");
	}

    }

}
