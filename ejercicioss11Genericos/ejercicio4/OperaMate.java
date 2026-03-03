package ejercicioss11Genericos.ejercicio4;

public class OperaMate<T extends Number> {

    T number;

    public OperaMate(T number) {
	this.number = number;
    }

    public double reciproco() {
	return 1 / (double) number;
    }

    public double fraccion() {
	return number.doubleValue() - Math.floor(number.doubleValue());
    }
}
