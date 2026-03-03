package ejercicios6Excepciones;

public class Producto {
    private int model;
    private byte stock;
    private double price;
    private int pKey;
    private static int index = 1;

    public Producto() throws Exception {
	this(1, (byte) 0, 0.0);
    }

    public Producto(int model, byte stock, double price) throws Exception {

	if (model < 1 || model > 1000) {
	    throw new IllegalArgumentException("El modelo debe estar entre 1 y 1000.");
	}

	if (stock < 0) {
	    throw new IllegalArgumentException("El stock debe ser mayor o igual a 0.");
	}
	if (price < 0) {
	    throw new Exception("El precio debe ser mayor o igual a 0.");
	}

	this.model = model;
	this.stock = stock;
	this.price = price;
	this.pKey = index;
	index++;
    }

    protected int getModel() {
	return model;
    }

    public void setPrice(double price) throws Exception {
	if (price < 0) {
	    throw new Exception("El precio debe ser mayor o igual a 0.");
	}
	this.price = price;
    }

    public void reduceStock(byte amount) {
	if (amount < 0) {
	    throw new IllegalArgumentException("La cantidad a reducir no puede ser negativa.");
	}
	if (this.stock - amount < 0) {
	    throw new IllegalArgumentException("No hay suficiente stock.");
	}
	this.stock -= amount;
    }

    @Override
    public String toString() {
	return "Producto [model=" + model + ", stock=" + stock + ", price=" + price + ", pKey=" + pKey + "]";
    }

    public String showPKey() {
	return "Soy el producto numero " + pKey;
    }
}
