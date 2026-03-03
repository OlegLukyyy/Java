package ejercicios4ArraysMultidimensionales;

public class Ejercicio5 {

    public static void main(String[] args) {
	new Ejercicio5().ejercicio5();
    }

    public void ejercicio5() {
	int[][] array = { { 4, 15, 14, 1 }, { 9, 6, 7, 12 }, { 5, 10, 11, 8 }, { 16, 3, 2, 13 } };
	System.out.println(isMagic(array));
    }

    public boolean isMagic(int[][] array) {

	int sumaFila;
	int sumaColumna;
	int sumaDiagonal1 = 0;
	int sumaDiagonal2 = 0;
	int sumaReferencia;

	for (int i = 0; i < array.length; i++) {
	    sumaDiagonal1 += array[i][i];
	    sumaDiagonal2 += array[array.length - 1 - i][array.length - 1 - i];
	}

	if (sumaDiagonal2 == sumaDiagonal1) {
	    sumaReferencia = sumaDiagonal1;
	} else {
	    return false;
	}

	for (int i = 0; i < array.length; i++) {
	    sumaFila = 0;
	    sumaColumna = 0;
	    for (int j = 0; j < array.length; j++) {
		sumaFila += array[i][j];
		sumaColumna += array[j][i];
	    }

	    if (sumaFila != sumaReferencia || sumaColumna != sumaReferencia) {
		return false;
	    }

	}

	return true;
    }

}
