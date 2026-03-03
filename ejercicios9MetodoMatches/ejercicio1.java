package ejercicios9MetodoMatches;

public class ejercicio1 {

    public static void main(String[] args) {

	new ejercicio1().show();

    }

    void show() {

	System.out.println("lunes".matches("lunes")); // TRUE
	System.out.println("Abc".matches("[a-zA-Z]{3}"));
	System.out.println("holaquea".matches("[a-zA-Z[^ñz]]{5,}"));
	System.out.println("dasd".matches("^[^0-9].*"));
	System.out.println("dasd".matches("[^b]*"));
	System.out.println("683128497".matches("[0-9]{9}"));
	System.out.println("12245678E".matches("[0-9]{8}[A-Z]$"));
	System.out.println("Paco".matches("^[A-Z]{1}[a-z]+"));
	System.out.println("Appw".matches("^[aeiouyAEIOUY][a-zA-Z]*"));
    }

}
