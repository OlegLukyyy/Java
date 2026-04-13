package ejercicioss13Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ejercicio2 {

	public static void main(String[] args) {

		List<Alumno> alumnos = new ArrayList<>();

		alumnos.add(new Alumno("Juan", false, 7.5));
		alumnos.add(new Alumno("María", true, 5.2));
		alumnos.add(new Alumno("Carlos", false, 8.9));
		alumnos.add(new Alumno("Lucía", false, 6.3));
		alumnos.add(new Alumno("Lucía", false, 6.1));
		alumnos.add(new Alumno("Pedro", true, 4.8));
		alumnos.add(new Alumno("Ana", false, 9.1));
		alumnos.add(new Alumno("Luis", true, 3.7));
		alumnos.add(new Alumno("Elena", false, 7.0));

		alumnos.sort(Comparator.comparing(Alumno::getNombre));
		alumnos.forEach(System.out::println);
		System.out.println("--------------------------------------------");
		alumnos.sort(Comparator.comparing(Alumno::getNombre).reversed()
				.thenComparing(Comparator.comparing(Alumno::getNota).reversed()));
		alumnos.forEach(System.out::println);
	}

}
