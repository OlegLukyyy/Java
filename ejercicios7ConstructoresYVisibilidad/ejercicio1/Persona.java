package ejercicios7ConstructoresYVisibilidad.ejercicio1;

public class Persona {

    protected String nombre;
    protected int edad;
    protected String sexo;
    protected String nacionalidad;

    public Persona() {

	this.nombre = "undefined";
	this.edad = 0;
	this.sexo = "undefined";
	this.nacionalidad = "undefined";

    }

    @Override
    public String toString() {
	return "Persona [nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", nacionalidad=" + nacionalidad
		+ "]";
    }

}
