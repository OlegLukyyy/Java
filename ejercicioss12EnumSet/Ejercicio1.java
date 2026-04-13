package ejercicioss12EnumSet;

import java.time.Month;
import java.util.EnumSet;

public class Ejercicio1 {

	public static void main(String[] args) {
		new Ejercicio1().run();
	}

	public void run() {

		EnumSet<Month> meses = EnumSet.allOf(Month.class);

		EnumSet<Month> mesesVacio = EnumSet.noneOf(Month.class);
		mesesVacio.add(Month.JUNE);
		mesesVacio.add(Month.JULY);
		mesesVacio.add(Month.AUGUST);

		EnumSet<Month> mesesSinVerano = EnumSet.complementOf(mesesVacio);

		EnumSet<Month> copia = EnumSet.copyOf(mesesSinVerano);

		EnumSet<Month> mesesNavidad = EnumSet.range(Month.SEPTEMBER, Month.DECEMBER);

	}

}
