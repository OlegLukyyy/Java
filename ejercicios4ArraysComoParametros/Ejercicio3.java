package ejercicios4ArraysComoParametros;

public class Ejercicio3 {

    public static void main(String[] args) {

	new Ejercicio3().ejercicio3();

    }

    public void ejercicio3() {

	int[] array = { 1, 2, 3, 4 };
	System.out.println(sumaArray(array));

    }

    public int sumaArray(int[] array) {

	int suma = 0;

	for (int i = 0; i < array.length; i++) {

	    suma += array[i];

	}
	return suma;

    }

}
