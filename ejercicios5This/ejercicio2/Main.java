package ejercicios5This.ejercicio2;

public class Main {

    public void run() {
	Person person = new Person();
	person.setName("Juan");
	person.setAge(20);
	person.setHeight(1.75f);
	person.setWork("Estudiante");
	System.out.println(person);
    }

    public static void main(String[] args) {
	new Main().run();
    }

}
