package ejercicios7ClasesAbstractas;

public abstract class GeometricFigure {

    protected String color;
    protected double areaValue;

    public abstract double calculateArea();

    public String toString() {
	return String.format("[type=%s, color= %s, areaValue=%.2f]", getClass().getSimpleName(), color, areaValue);
    }
}
