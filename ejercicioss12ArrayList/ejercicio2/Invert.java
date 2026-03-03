package ejercicioss12ArrayList.ejercicio2;

import java.util.ArrayList;

public class Invert {

    ArrayList<E> al;

    public <T> List<T> Invert(ArrayList<E> al) {
	this.al = al;
    }

    public ArrayList<E> getInvert() {

	ArrayList<E> invertida = new ArrayList<E>();

	for (int i = al.size() - 1; i >= 0; i--) {
	    invertida.add(al.get(i));

	}

	return invertida;

    }
}

