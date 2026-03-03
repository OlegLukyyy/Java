package ejercicioss11Genericos.ejercicio1;

public class Caja<T> {

    private T object;

    public Caja(T object) {

	this.object = object;

    }

    public T getObject() {

	return this.object;

    }

    public void setObject(T object) {
	this.object = object;
    }

}
