package ejercicios4ArraysComoParametros;

public class Ejercicio1 {

    public static void main(String[] args) {
	System.out.println(new Ejercicio1().ejercicio1(1, 2, 3));
    }

    public int ejercicio1(int... array) {

	int result = 1;

	for (int i = 0; i < array.length; i++) {

	    result *= array[i];

	}

	return result;

    }

}
