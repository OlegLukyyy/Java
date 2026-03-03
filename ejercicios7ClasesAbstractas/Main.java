package ejercicios7ClasesAbstractas;

public class Main {

    public static void main(String[] args) {

	new Main().show();

    }

    public void show() {

	GeometricFigure[] gf = new GeometricFigure[3];

	gf[0] = new Rectangle();
	gf[1] = new Circle();
	gf[2] = new Triangle();

	for (GeometricFigure geometricFigure : gf) {

	    System.out.println(geometricFigure);

	}

    }

}
