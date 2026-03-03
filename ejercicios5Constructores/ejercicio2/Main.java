package ejercicios5Constructores.ejercicio2;

public class Main {

    public void showPerson() {
	Person person = new Person("Ana", 25, 1.68f, "Ingeniera");
	System.out.println(person);
    }

    public static void main(String[] args) {
	new Main().showPerson();
    }

}
