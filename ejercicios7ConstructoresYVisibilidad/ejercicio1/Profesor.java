package ejercicios7ConstructoresYVisibilidad.ejercicio1;

public class Profesor extends Persona {

    protected int sueldo;

    public Profesor() {

	this.nombre = "undefined";
	this.edad = 0;
	this.sexo = "undefined";
	this.nacionalidad = "undefined";
	this.sueldo = 0;

    }

    @Override
    public String toString() {
	return "Profesor [sueldo=" + sueldo + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo
		+ ", nacionalidad=" + nacionalidad + "]";
    }

}
