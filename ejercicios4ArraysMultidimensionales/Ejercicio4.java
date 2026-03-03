package ejercicios4ArraysMultidimensionales;

public class Ejercicio4 {

    public static void main(String[] args) {
	new Ejercicio4().ejercicio4();
    }

    public void ejercicio4() {
	int[][] array = { { 1, 2, 3, 4 }, { 2, 5, 6, 7 }, { 3, 6, 8, 9 }, { 4, 7, 9, 10 } };
	showSums(array);
    }

    public void showSums(int[][] array) {
	int sumaFila;
	int sumaColumna;
	for (int i = 0; i < array.length; i++) {
	    sumaFila = 0;
	    sumaColumna = 0;
	    for (int j = 0; j < array.length; j++) {

		sumaFila += array[i][j];
		sumaColumna += array[j][i];
	    }
	    System.out.printf("La suma de la fila %d es %d\n", i + 1, sumaFila);
	    System.out.printf("La suma de la columna %d es %d\n", i + 1, sumaColumna);
	}
    }

}
