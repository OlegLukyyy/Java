package ejercicios7ClasesAnidadas;

public class Vehicle {

    protected String brand;
    protected String model;
    protected Engine engine;

    public class Engine {

	protected int displacement;
	protected String fuelType;

	public Engine(int displacement, String fuelType) {
	    this.displacement = displacement;
	    this.fuelType = fuelType;
	}

	@Override
	public String toString() {
	    return "Engine displacement=" + displacement + ", fuelType=" + fuelType;
	}

    }

    public void installEngine(int displacement, String fuelType) {

	this.engine = new Engine(displacement, fuelType);

    }

    @Override
    public String toString() {
	return "Vehicle brand=" + brand + ", model=" + model + ", engine=" + engine;
    }

}
