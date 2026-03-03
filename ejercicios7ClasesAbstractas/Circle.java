package ejercicios7ClasesAbstractas;

public class Circle extends GeometricFigure {

    protected double radius;

    public Circle() {
	this.color = "Red";
	this.radius = 5.5;
	this.areaValue = calculateArea();
    }

    public double calculateArea() {

	return Math.PI * radius * radius;

    }

}
