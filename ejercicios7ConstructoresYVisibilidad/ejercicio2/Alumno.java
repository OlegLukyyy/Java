package ejercicios7ConstructoresYVisibilidad.ejercicio2;

public class Alumno extends Persona {

    protected boolean repetidor;

    public Alumno() {
	super("undefined", 0, "undefined", "undefined");
	this.repetidor = false;
    }

    @Override
    public String toString() {
	return "Alumno [repetidor=" + repetidor + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo
		+ ", nacionalidad=" + nacionalidad + "]";
    }

}
