package ejercicios5Records;

public class GestionProductos {
    public static void main(String[] args) {

	Producto producto = new Producto(2, "dsad", 100);
	System.out.println(producto);
	producto = producto.aplicarDescuento(0.21);
	System.out.println(producto);

    }
}
