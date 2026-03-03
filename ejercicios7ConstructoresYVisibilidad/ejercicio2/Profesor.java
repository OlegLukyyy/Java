package ejercicios7ConstructoresYVisibilidad.ejercicio2;

public class Profesor extends Persona {

    protected int sueldo;

    public Profesor() {

	super("undefined", 0, "undefined", "undefined");
	this.sueldo = 0;

    }

    @Override
    public String toString() {
	return "Profesor [sueldo=" + sueldo + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo
		+ ", nacionalidad=" + nacionalidad + "]";
    }

}
