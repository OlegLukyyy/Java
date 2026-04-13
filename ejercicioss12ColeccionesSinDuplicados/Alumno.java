package ejercicioss12ColeccionesSinDuplicados;

import java.util.Objects;

public class Alumno {

	private String dni;
	private String nombre;
	private String apellido;

	public Alumno(String dni, String nombre, String apellido) {
		this.apellido = apellido;
		this.dni = dni;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Alumno [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Alumno)) {
			return false;
		}
		Alumno other = (Alumno) obj;
		return Objects.equals(dni, other.dni);
	}

}
