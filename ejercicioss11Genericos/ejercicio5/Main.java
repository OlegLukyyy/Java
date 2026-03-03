package ejercicioss11Genericos.ejercicio5;

public class Main {

    public static void main(String[] args) {
	// Crear objetos AccesoPuntual con tipo Double
	AccesoPuntual<Double> acceso1 = new AccesoPuntual<>(Bono.COMPLETO, 4.53, 5);
	AccesoPuntual<Double> acceso2 = new AccesoPuntual<>(Bono.NORMAL, 4.53, 5);
	AccesoPuntual<Double> acceso3 = new AccesoPuntual<>(Bono.MINIMO, 4.53, 5);

	// Crear objetos AccesoPuntual con tipo Integer
	AccesoPuntual<Integer> acceso4 = new AccesoPuntual<>(Bono.COMPLETO, 4, 5);
	AccesoPuntual<Integer> acceso5 = new AccesoPuntual<>(Bono.NORMAL, 4, 5);
	AccesoPuntual<Integer> acceso6 = new AccesoPuntual<>(Bono.MINIMO, 4, 5);

	// Imprimir los resultados
	System.out.println("Accesos puntuales con Double:");
	System.out.println(acceso1);
	System.out.println(acceso2);
	System.out.println(acceso3);

	System.out.println("\nAccesos puntuales con Integer:");
	System.out.println(acceso4);
	System.out.println(acceso5);
	System.out.println(acceso6);// TODO Auto-generated method stub

    }

}
