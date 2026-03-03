package ejercicioss12ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Ejercicio1<E> {

    public static void main(String[] args) {
	new Ejercicio1().show();
    }

    public void show() {

	ArrayList<Integer> al = new ArrayList<>(Arrays.asList(5, 1, 5, 5, 5, 5, 5, 5, 5, 5));
	System.out.println(getAverage(al));
	showLowerThanAverage(al, getAverage(al));

    }

    public void showLowerThanAverage(ArrayList<Integer> al, double avg) {

	for (int valor : al) {
	    if (valor < avg) {
		System.out.print(valor + " ");
	    }
	}

    }

    public double getAverage(ArrayList<Integer> al) {

	int avg = 0;
	int index = 0;

	for (Iterator<Integer> iterator = al.iterator(); iterator.hasNext();) {
	    avg += iterator.next();
	    index++;
	}

	return (double) avg / index;

    }

}
