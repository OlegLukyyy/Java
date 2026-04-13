package ejercicioss12MapaEnUnEnum;

import java.util.Map;

public enum BasicStringOperation implements StringOperation {
	TO_LOWER("Changing all characters into lower case", 'L') {
		@Override
		public String apply(String input) {
			return input.toLowerCase();
		}
	},
	TO_UPPER("Changing all characters into upper case", 'U') {

		@Override
		public String apply(String input) {
			return input.toUpperCase();
		}

	};

	BasicStringOperation(String description, char symbol) {
		this.description = description;
		this.symbol = symbol;

	}

	private static final Map<Character, BasicStringOperation> symbolToOperation = Map.of(
			BasicStringOperation.TO_LOWER.getSymbol(), BasicStringOperation.TO_LOWER,
			BasicStringOperation.TO_UPPER.getSymbol(), BasicStringOperation.TO_UPPER);

	public static BasicStringOperation fromSymbol(char symbol) {
		return symbolToOperation.get(symbol);
	}

	String description;
	char symbol;

	@Override
	public String getDescription() {

		return this.description;
	}

	public char getSymbol() {

		return this.symbol;
	}
}
