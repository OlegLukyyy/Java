package ejercicios7ConstructoresYVisibilidad.ejercicio1;

public class Alumno extends Persona {

    protected boolean repetidor;

    public Alumno() {
	this.nombre = "undefined";
	this.edad = 0;
	this.sexo = "undefined";
	this.nacionalidad = "undefined";
	this.repetidor = false;
    }

    @Override
    public String toString() {
	return "Alumno [repetidor=" + repetidor + ", nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo
		+ ", nacionalidad=" + nacionalidad + "]";
    }

}
