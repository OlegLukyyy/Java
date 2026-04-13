package ejercicioss12Arboles;

import java.util.EnumMap;
import java.util.Map;

public class Key implements Comparable<Key> {
	private Category category;
	private int number;

	private static Map<Category, Integer> counters = new EnumMap<>(Category.class);;

	public Key(Category category) {
		this.category = category;
		this.number = getNextNumber(category);

	}

	private int getNextNumber(Category category) {
		int next = counters.getOrDefault(category, 0) + 1;

		counters.put(category, next);
		return next;
	}

	public Category getCategory() {
		return category;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public int compareTo(Key other) {
		int cmp = other.category.ordinal() - this.category.ordinal(); // desc por categoría
		if (cmp != 0)
			return cmp;
		return this.number - other.number; // asc por número
	}

	@Override
	public String toString() {
		return String.valueOf(category.code) + number;
	}

}
