package ejercicios4ArraysComoParametros;

public class Ejercicio4 {

    public static void main(String[] args) {
	int[] array = { 1, 5, 4, 5, 1 };
	new Ejercicio4().ejercicio4(array, 5);
    }

    public void ejercicio4(int[] array, int n) {

	int[] pos = new int[array.length];
	int count = 0;
	String stringArray = "";

	for (int i = 0; i < array.length; i++) {
	    if (array[i] == n) {
		pos[count] = i + 1;
		count++;
	    }
	}

	for (int i = 0; i < count; i++) {
	    stringArray += pos[i] + (i == count - 1 ? "." : ",");
	}

	System.out.printf("Las posiciones que contienen el valor %d son: %s\n", n, stringArray);
	System.out.printf("El numero %d aparece %d veces el array", n, count);
    }

}
