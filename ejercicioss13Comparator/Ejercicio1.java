package ejercicioss13Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ejercicio1 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Ana");
		list.add("Juan");
		list.add("Rodrigo");
		list.add("Pedro");

		list.sort(Comparator.naturalOrder());
		list.sort(Comparator.reverseOrder());

		list.add(null);
		list.add(null);

		list.sort(Comparator.nullsFirst(Comparator.naturalOrder()));
		list.sort(Comparator.nullsLast(Comparator.reverseOrder()));

	}

}
