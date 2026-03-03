package ejercicios4RetornoDeArrays;

import java.util.Arrays;

public class Ejercicio1 {

    public static void main(String[] args) {
	new Ejercicio1().ejercicio1();
    }

    public void ejercicio1() {
	char[] array = { 'c', 'a', 'd', ' ' };
	System.out.println(Arrays.toString(insert(array, 'z', 0)));
    }

    public char[] insert(char[] array, char c, int pos) {
	for (int i = array.length - 1; i > pos; i--) {
	    array[i] = array[i - 1];
	}
	array[pos] = c;
	return array;
    }

}
