package ejercicios4RetornoDeArrays;

import java.util.Arrays;

public class Ejercicio5 {

    public static void main(String[] args) {
	new Ejercicio5().ejercicio5();
    }

    public void ejercicio5() {
	float[] array = { 1.4f, 5.3f, 9.6f, 14.5f, 15.9f, 17.9f, 21.2f, 100.8f };
	System.out.println(getFloatIndex(array, 17.9f));
    }

    public int getFloatIndex(float[] array, float n) {

	if (array[array.length / 2] == n) {
	    return array.length / 2;
	} else if (array[array.length / 2] > n) {
	    return getFloatIndex(Arrays.copyOfRange(array, 0, array.length / 2), n);
	} else if (array[array.length / 2] < n) {
	    return getFloatIndex(Arrays.copyOfRange(array, array.length / 2, array.length), n) + array.length / 2;
	}
	return -1;
    }
}
