package ejercicios4ArraysMultidimensionales;

public class Ejercicio6 {

    int n = 8;
    int[][] matrizSoluciones = new int[n][n];

    public static void main(String[] args) {
	new Ejercicio6().ejercicio6();
    }

    public void ejercicio6() {
	backtracking();

    }

    public void backtracking() {
	int count = 0;
	for (int i = 0; i < matrizSoluciones.length; i++) {
	    for (int j = 0; j < matrizSoluciones.length; j++) {
		if (isValid()) {
		    matrizSoluciones[i][j] = 1;
		    count++;
		}
	    }
	}

    }

}
