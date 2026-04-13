package ejercicioss12ColeccionesSinDuplicados;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1 {

	public static void main(String[] args) {
		new Ejercicio1().show();
	}

	public void show() {
		Scanner sc = new Scanner(System.in);

		// 1. Registrar alumnos con LinkedHashSet (conserva inserción)
		Set<Alumno> conOrden = new LinkedHashSet<>();

		System.out.println("=== Registro de alumnos ===");
		System.out.print("¿Cuántos alumnos quieres registrar? ");
		int cantidad = Integer.parseInt(sc.nextLine());

		for (int i = 0; i < cantidad; i++) {
			System.out.print("DNI: ");
			String dni = sc.nextLine();
			System.out.print("Nombre: ");
			String nombre = sc.nextLine();
			System.out.print("Apellido: ");
			String apellido = sc.nextLine();

			Alumno alumno = new Alumno(dni, nombre, apellido);
			boolean añadido = conOrden.add(alumno);

			if (!añadido) {
				System.out.println("⚠️  Alumno con DNI " + dni + " ya estaba registrado.");
			}
			System.out.println();
		}

		// 2. Mostrar con orden de inserción (LinkedHashSet)
		System.out.println("=== Alumnos (orden de inserción) ===");
		for (Alumno a : conOrden) {
			System.out.println(a);
		}

		// 3. Mostrar sin orden garantizado (HashSet)
		Set<Alumno> sinOrden = new HashSet<>(conOrden);
		System.out.println("\n=== Alumnos (sin orden garantizado) ===");
		for (Alumno a : sinOrden) {
			System.out.println(a);
		}

		// 4. Eliminar por DNI
		System.out.print("\nIntroduce el DNI del alumno a eliminar: ");
		String dniEliminar = sc.nextLine();

		// Buscamos el alumno por DNI y lo eliminamos
		// equals() de Alumno compara por DNI, así que esto funciona
		boolean eliminado = conOrden.remove(new Alumno(dniEliminar, "", ""));

		if (eliminado) {
			System.out.println("✅ Alumno eliminado correctamente.");
		} else {
			System.out.println("❌ No se encontró ningún alumno con ese DNI.");
		}

		// 5. Mostrar resultado tras eliminación
		System.out.println("\n=== Alumnos tras la eliminación ===");
		for (Alumno a : conOrden) {
			System.out.println(a);
		}

		sc.close();
	}

}
