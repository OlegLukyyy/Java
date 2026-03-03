package ejercicioss11Genericos.ejercicio2;

public class Main {

    public static void main(String[] args) {
	Pareja<String, Integer> pareja = new Pareja<>("Hola", 123);

	// Obtener los elementos
	System.out.println("Primer Elemento: " + pareja.getFirstElement()); // Imprime: "Hola"
	System.out.println("Segundo Elemento: " + pareja.getSecondElement()); // Imprime: 123

	// Mostrar los tipos
	pareja.mostrarTipos(); // Imprime los tipos: java.lang.String y java.lang.Integer

	// Comprobar si ambos elementos son del mismo tipo
	System.out.println("¿Son del mismo tipo? " + pareja.mismoTipo()); // Imprime: false

	// Crear una Pareja de tipos iguales
	Pareja<String, String> pareja2 = new Pareja<>("Hola", "Mundo");

	// Comprobar si ambos elementos son del mismo tipo
	System.out.println("¿Son del mismo tipo? " + pareja2.mismoTipo()); // Imprime: true
    }

}
