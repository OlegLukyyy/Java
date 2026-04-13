package ejercicioss13InterfacesFuncionalesPurasPredefinidas;

import java.util.HashMap;
import java.util.Map;

public class Ejercicio3 {
	public static void main(String[] args) {
		new Ejercicio3().show();
	}

	Map<String, Double> empleados = new HashMap<String, Double>();

	public void show() {

		empleados.computeIfAbsent("Luis", k -> 1000.00);
		empleados.forEach((k, v) -> System.out.println(k + " - " + v));
		empleados.computeIfPresent("Luis", (k, v) -> v * 1.2);
		empleados.forEach((k, v) -> System.out.println(k + " - " + v));
		empleados.replaceAll((k, v) -> v * 1.10);
		empleados.forEach((k, v) -> System.out.println(k + " - " + v));

	}

	public void introduce() {

	}

}
