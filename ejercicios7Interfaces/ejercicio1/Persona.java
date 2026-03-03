package ejercicios7Interfaces.ejercicio1;

public abstract class Persona implements Validate {

    String name;

    boolean valid = false;

    public abstract String numberType();

    @Override
    public String toString() {

	return String.format("%s , %s validado,", name, valid ? "Si" : "No");

    }

}
