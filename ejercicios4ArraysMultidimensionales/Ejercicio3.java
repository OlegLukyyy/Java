package ejercicios4ArraysMultidimensionales;

public class Ejercicio3 {

    public static void main(String[] args) {
	new Ejercicio3().ejercicio3();
    }

    public void ejercicio3() {
	int[][] array = { { 1, 2, 3, 4 }, { 2, 5, 6, 7 }, { 3, 6, 8, 9 }, { 4, 7, 9, 10 } };
	showSymetrical(array);
    }

    public void showSymetrical(int[][] array) {
	int[] fila = new int[array.length];
	int[] columna = new int[array.length];
	boolean iguales;

	for (int i = 0; i < array.length; i++) {

	    fila = array[i];
	    iguales = true;
	    for (int j = 0; j < array.length; j++) {
		columna[j] = array[i][j];

	    }

	    for (int k = 0; k < array.length; k++) {
		if (fila[k] != columna[k]) {
		    iguales = false;
		}
	    }
	    if (iguales) {
		System.out.print("Fila " + (i + 1) + ": ");
		for (int j = 0; j < array.length; j++) {
		    System.out.print(fila[j] + (j < array.length - 1 ? ", " : ""));
		}
		System.out.println(" es igual a columna " + (i + 1) + ".");
	    }

	}

    }

}
