package ejercicios8TiposEnumerados;

public enum ExtendedStringOperation implements StringOperation {
    STRIP("Removing leading and trailing spaces") {
	@Override
	public String apply(String input) {
	    return input.trim();
	}
    },
    REVERSE("Reversing the given string") {
	@Override
	public String apply(String input) {
	    String reversed = "";
	    for (int i = 1; i < input.length(); i++) {
		reversed += input.charAt(input.length() - i);
	    }
	    return reversed;
	}
    };

    String description;

    ExtendedStringOperation(String description) {
	this.description = description;
    }

    @Override
    public String getDescription() {
	return this.description;
    }

}
