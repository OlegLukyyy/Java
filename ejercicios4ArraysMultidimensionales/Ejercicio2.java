package ejercicios4ArraysMultidimensionales;

public class Ejercicio2 {

    public static void main(String[] args) {
	new Ejercicio2().ejercicio2();
    }

    public void ejercicio2() {
	int[][][] array = { { { 1, 2, 3 }, // Primera fila
		{ 4, 5, 6 }, // Segunda fila
		{ 7, 8, 9 } // Tercera fila
		}, { { 10, 11, 12 }, // Primera fila
			{ 13, 14, 15 }, // Segunda fila
			{ 16, 17, 18 } // Tercera fila
		}, { { 19, 20, 21 }, // Primera fila
			{ 22, 23, 24 }, // Segunda fila
			{ 25, 26, 27 } // Tercera fila
		} };
	System.out.println(getBiggest(array));
    }

    public int getBiggest(int[][][] array) {
	int biggest = array[0][0][0];
	for (int i = 0; i < array.length; i++) {

	    for (int j = 0; j < array[i].length; j++) {

		for (int z = 0; z < array[i][j].length; z++) {

		    if (array[i][j][z] > biggest) {
			biggest = array[i][j][z];
		    }

		}

	    }

	}
	return biggest;
    }

}
