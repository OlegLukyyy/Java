package ejercicios6Excepciones;

import java.util.Scanner;

public class ConsoleInput {

    private Scanner keyboard;

    public ConsoleInput(Scanner keyboard) {
	this.keyboard = keyboard;
    }

    private void cleanInput() {
	if (keyboard.hasNextLine()) {
	    keyboard.nextLine();
	}
    }

    public int readInt() {
	int value = 0;
	boolean valid = false;
	while (!valid) {
	    try {
		value = Integer.parseInt(keyboard.nextLine());
		valid = true;
	    } catch (NumberFormatException e) {
		System.out.println("Entrada no válida. Por favor, ingrese un número entero.");
	    }
	    cleanInput();
	}
	return value;
    }

    public int readIntLessThan(int upperBound) {
	int value = 0;
	boolean valid = false;
	while (!valid) {
	    value = readInt();
	    if (value < upperBound) {
		valid = true;
	    } else {
		System.out.println("El número debe ser menor que " + upperBound + ". Intente de nuevo.");
	    }
	    cleanInput();
	}
	return value;
    }

    public int readIntLessOrEqualThan(int upperBound) {
	int value = 0;
	boolean valid = false;
	while (!valid) {
	    value = readInt();
	    if (value <= upperBound) {
		valid = true;
	    } else {
		System.out.println("El número debe ser menor o igual que " + upperBound + ". Intente de nuevo.");
	    }
	    cleanInput();
	}
	return value;
    }

    public int readIntGreaterThan(int lowerBound) {
	int value = 0;
	boolean valid = false;
	while (!valid) {
	    value = readInt();
	    if (value > lowerBound) {
		valid = true;
	    } else {
		System.out.println("El número debe ser mayor que " + lowerBound + ". Intente de nuevo.");
	    }
	    cleanInput();
	}
	return value;
    }

    public int readIntGreaterOrEqualThan(int lowerBound) {
	int value = 0;
	boolean valid = false;
	while (!valid) {
	    value = readInt();
	    if (value >= lowerBound) {
		valid = true;
	    } else {
		System.out.println("El número debe ser mayor o igual que " + lowerBound + ". Intente de nuevo.");
	    }
	    cleanInput();
	}
	return value;
    }

    public int readIntInRange(int lowerBound, int upperBound) {
	int value = 0;
	boolean valid = false;
	while (!valid) {
	    value = readInt();
	    if (value >= lowerBound && value <= upperBound) {
		valid = true;
	    } else {
		System.out.println(
			"El número debe estar en el rango [" + lowerBound + ", " + upperBound + "]. Intente de nuevo.");
	    }
	    cleanInput();
	}
	return value;
    }

    public double readDouble() {
	double value = 0;
	boolean valid = false;
	while (!valid) {
	    try {
		value = Double.parseDouble(keyboard.nextLine());
		valid = true;
	    } catch (NumberFormatException e) {
		System.out.println("Entrada no válida. Por favor, ingrese un número decimal.");
	    }
	    cleanInput();
	}
	return value;
    }

    public double readDoubleLessThan(double upperBound) {
	double value = 0;
	boolean valid = false;
	while (!valid) {
	    value = readDouble();
	    if (value < upperBound) {
		valid = true;
	    } else {
		System.out.println("El número debe ser menor que " + upperBound + ". Intente de nuevo.");
	    }
	    cleanInput();
	}
	return value;
    }

    public double readDoubleLessOrEqualThan(double upperBound) {
	double value = 0;
	boolean valid = false;
	while (!valid) {
	    value = readDouble();
	    if (value <= upperBound) {
		valid = true;
	    } else {
		System.out.println("El número debe ser menor o igual que " + upperBound + ". Intente de nuevo.");
	    }
	    cleanInput();
	}
	return value;
    }

    public double readDoubleGreaterThan(double lowerBound) {
	double value = 0;
	boolean valid = false;
	while (!valid) {
	    value = readDouble();
	    if (value > lowerBound) {
		valid = true;
	    } else {
		System.out.println("El número debe ser mayor que " + lowerBound + ". Intente de nuevo.");
	    }
	    cleanInput();
	}
	return value;
    }

    public double readDoubleGreaterOrEqualThan(double lowerBound) {
	double value = 0;
	boolean valid = false;
	while (!valid) {
	    value = readDouble();
	    if (value >= lowerBound) {
		valid = true;
	    } else {
		System.out.println("El número debe ser mayor o igual que " + lowerBound + ". Intente de nuevo.");
	    }
	    cleanInput();
	}
	return value;
    }

    public double readDoubleInRange(double lowerBound, double upperBound) {
	double value = 0;
	boolean valid = false;
	while (!valid) {
	    value = readDouble();
	    if (value >= lowerBound && value <= upperBound) {
		valid = true;
	    } else {
		System.out.println(
			"El número debe estar en el rango [" + lowerBound + ", " + upperBound + "]. Intente de nuevo.");
	    }
	    cleanInput();
	}
	return value;
    }

    public String readString() {
	return keyboard.nextLine();
    }

    public String readString(int maxLength) {
	String value = "";
	boolean valid = false;
	while (!valid) {
	    value = readString();
	    if (value.length() <= maxLength) {
		valid = true;
	    } else {
		System.out.println("La cadena no debe exceder los " + maxLength + " caracteres. Intente de nuevo.");
	    }
	}
	return value;
    }

    public char readChar() {
	char value = ' ';
	boolean valid = false;
	while (!valid) {
	    String input = readString();
	    if (input.length() == 1) {
		value = input.charAt(0);
		valid = true;
	    } else {
		System.out.println("Por favor, ingrese un solo carácter.");
	    }
	}
	return value;
    }

    public boolean readBooleanUsingChar(char affirmativeValue, char negativeValue) {
	char value = ' ';
	boolean valid = false;
	while (!valid) {
	    value = readChar();
	    if (Character.toLowerCase(value) == Character.toLowerCase(affirmativeValue)) {
		valid = true;
		return true;
	    } else if (Character.toLowerCase(value) == Character.toLowerCase(negativeValue)) {
		valid = true;
		return false;
	    } else {
		System.out.println("Entrada no válida. Ingrese '" + affirmativeValue + "' para verdadero o '"
			+ negativeValue + "' para falso.");
	    }
	}
	return false;
    }
}