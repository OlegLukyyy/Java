package ejercicioss11Genericos.ejercicio5;

public class AccesoPuntual<T extends Number> {
    Bono bono;
    T precio;
    int nActividades;

    public AccesoPuntual(Bono bono, T precio, int nActividades) {
	this.bono = bono;
	this.precio = precio;
	this.nActividades = nActividades;
    }

    public double calcularPrecio() {

	if (bono == Bono.MINIMO) {
	    return (precio.doubleValue() / 3) * nActividades;
	} else if (bono == Bono.NORMAL) {
	    return (precio.doubleValue() / 2) * nActividades;
	} else if (bono == Bono.COMPLETO) {
	    return (precio.doubleValue() - (precio.doubleValue() - Math.floor(precio.doubleValue())) * 2)
		    * nActividades;
	} else {
	    return -1;
	}

    }

    public String toString() {

	if (precio instanceof Double) {
	    return String.format("Bono: %s Precio por actividad: %.2f Número de actividades: %d Precio total: %.2f",
		    bono, precio.doubleValue(), nActividades, calcularPrecio());
	} else if (precio instanceof Integer) {
	    return String.format("Bono: %s Precio por actividad: %d Número de actividades: %d Precio total: %.2f", bono,
		    precio.intValue(), nActividades, calcularPrecio());
	} else {
	    return "Tipo de precio no soportado.";
	}

    }

}
