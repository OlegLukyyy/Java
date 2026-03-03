package ejercicios8TiposEnumerados;

public class Main {

    public static void main(String[] args) {
	new Main().show();
    }

    public void show() {

	String input = "       aprendiendo enums       ";

	for (BasicStringOperation op : BasicStringOperation.values()) {
	    System.out.println(op.getDescription() + ": \"" + op.apply(input) + "\"");
	}

	for (ExtendedStringOperation op : ExtendedStringOperation.values()) {
	    System.out.println(op.getDescription() + ": \"" + op.apply(input) + "\"");
	}

    }

}
