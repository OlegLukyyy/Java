package ejercicioss13Comparator;

public class Alumno {
	String nombre;
	boolean repetidor;
	Double nota;

	public Alumno(String nombre, boolean repetidor, Double nota) {

		this.nombre = nombre;
		this.repetidor = repetidor;
		this.nota = nota;

	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", repetidor=" + repetidor + ", nota=" + nota + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isRepetidor() {
		return repetidor;
	}

	public void setRepetidor(boolean repetidor) {
		this.repetidor = repetidor;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

}
