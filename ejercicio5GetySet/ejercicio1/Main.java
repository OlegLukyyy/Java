package ejercicio5GetySet.ejercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);

	Person person = new Person();
	person.setName("Juan");

	System.out.println(person.getName());

	String newName = scanner.nextLine();
	person.setName(newName);

	System.out.println(person.getName());
    }
}
