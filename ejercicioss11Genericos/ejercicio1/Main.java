package ejercicioss11Genericos.ejercicio1;

public class Main {

    public static void main(String[] args) {
	Caja<String> stringCaja = new Caja<>("Hola, Generics!");
	System.out.println("Contenido de la caja: " + stringCaja.getObject());

	Caja<Integer> intCaja = new Caja<>(123);
	System.out.println("Contenido de la caja: " + intCaja.getObject());

	intCaja.setObject(456);
	System.out.println("Nuevo contenido de la caja: " + intCaja.getObject());
    }

}
