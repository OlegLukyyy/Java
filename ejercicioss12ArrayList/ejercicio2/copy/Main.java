package ejercicioss12ArrayList.ejercicio2.copy;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	new Main().show();
    }

    public void show() {

	ArrayList<Double> doubleAL = new ArrayList<>(Arrays.asList(3.0, 5.0, 6.0, 7.0, 8.0, 89.0));
	Invert inv = new Invert<>(doubleAL);
	ArrayList<Double> invertida = inv.getInvert();

	System.out.println(invertida);

    }

}
