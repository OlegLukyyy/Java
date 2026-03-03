package ejercicios8TiposEnumerados;

public enum BasicStringOperation implements StringOperation {
    TO_LOWER("Changing all characters into lower case") {
	@Override
	public String apply(String input) {
	    return input.toLowerCase();
	}
    },
    TO_UPPER("Changing all characters into upper case") {
	@Override
	public String apply(String input) {
	    return input.toUpperCase();
	}
    };

    BasicStringOperation(String description) {
	this.description = description;
    }

    String description;

    @Override
    public String getDescription() {

	return this.description;
    }

}
