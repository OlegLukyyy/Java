package ejercicioss11Genericos.ejercicio2;

public class Pareja<T, V> {
    T element1;
    V element2;

    public Pareja(T element1, V element2) {
	this.element1 = element1;
	this.element2 = element2;
    }

    public T getFirstElement() {
	return this.element1;
    }

    public V getSecondElement() {
	return this.element2;
    }

    public void mostrarTipos() {

	if (element1 != null) {
	    System.out.println(element1.getClass().getName());
	} else {
	    System.out.println("Elemento 1 no disponible");
	}

	if (element2 != null) {
	    System.out.println(element2.getClass().getName());
	} else {
	    System.out.println("Elemento 2 no disponible");
	}

    }

    public boolean mismoTipo() {
	return element1.getClass() == element2.getClass();
    }

}
