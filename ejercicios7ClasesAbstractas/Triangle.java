package ejercicios7ClasesAbstractas;

public class Triangle extends GeometricFigure {

    protected double base;
    protected double height;

    public Triangle() {
	this.color = "Black";
	this.base = 10.4;
	this.height = 3;
	this.areaValue = calculateArea();
    }

    public double calculateArea() {
	return (base * height) / 2;
    }

}
