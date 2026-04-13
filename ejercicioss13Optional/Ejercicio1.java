package ejercicioss13Optional;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import ejercicioss13Comparator.Alumno;

public class Ejercicio1 {
	List<Alumno> alumnos = new ArrayList<Alumno>();

	public static void main(String[] args) {
		Ejercicio1 ej1 = new Ejercicio1();
		ej1.insert();
		ej1.show();
	}

	public Optional<Alumno> findRepeaterStudent(String nombre) {
		for (Alumno alumno : alumnos) {
			if (alumno.getNombre() == nombre && alumno.isRepetidor() == true) {
				return Optional.of(alumno);
			}
		}

		return Optional.empty();
	}

	public void insert() {
		alumnos.add(new Alumno("Juan", false, 7.5));
		alumnos.add(new Alumno("María", true, 5.2));
		alumnos.add(new Alumno("Carlos", false, 8.9));
		alumnos.add(new Alumno("Lucía", true, 6.3));
		alumnos.add(new Alumno("Lucía", true, 6.1));
		alumnos.add(new Alumno("Pedro", true, 4.8));
		alumnos.add(new Alumno("Ana", false, 9.1));
		alumnos.add(new Alumno("Luis", true, 3.7));
		alumnos.add(new Alumno("Elena", false, 7.0));

	}

	public void show() {

		findRepeaterStudent("Lucía").ifPresentOrElse(alumno -> System.out.println(alumno),
				() -> System.out.println("Alumno no encontrado"));

		System.out.println(findRepeaterStudent("Lucía").map(alumno -> alumno.getNota() + 1)
				.orElseThrow(() -> new IllegalStateException()));
		System.out.println(findRepeaterStudent("Lucía").filter(alumno -> alumno.getNota() > 5)
				.orElseThrow(() -> new NoSuchElementException()));

	}

}
