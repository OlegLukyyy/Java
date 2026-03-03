package ejercicios5Records;

import java.util.Objects;

public record Producto(int id, String nombre, double precio) {

    public Producto {
	if (id <= 0) {
	    throw new IllegalArgumentException("el id debe ser positivo");
	}
	if (nombre.isBlank()) {
	    throw new IllegalArgumentException("El nombre no puede estar vacío");
	}
	nombre = Objects.requireNonNull(nombre, "el nombre no puede ser nulo");
	if (precio < 0) {
	    throw new IllegalArgumentException("el precio debe ser positivo");
	}
    }

    public Producto aplicarDescuento(double descuento) {
	if (descuento < 0 || descuento > 100) {
	    throw new IllegalArgumentException("el decuento no es valido");

	} else {
	    return new Producto(id, nombre, precio * (1 - descuento));
	}
    }
}
