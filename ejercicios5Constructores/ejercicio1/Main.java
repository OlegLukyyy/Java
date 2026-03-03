package ejercicios5Constructores.ejercicio1;

public class Main {

    public static void main(String[] args) {
	new Main().showPerson();
    }

    public void showPerson() {
	Person person = new Person();
	System.out.println(person);
    }

}
