package ejercicios7ClasesAbstractas;

public class Rectangle extends GeometricFigure {

    protected double sideA;
    protected double sideB;

    public Rectangle() {
	this.color = "Yellow";
	this.sideA = 10;
	this.sideB = 10;
	this.areaValue = calculateArea();
    }

    public double calculateArea() {

	return sideA * sideB;

    }

}
