package ejercicioss12ArrayList.ejercicio2.copy;

import java.util.ArrayList;

public class Invert<E> {

    ArrayList<E> al;

    public Invert(ArrayList<E> al) {
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
