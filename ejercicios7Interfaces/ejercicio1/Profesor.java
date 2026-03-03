package ejercicios7Interfaces.ejercicio1;

public class Profesor extends Persona implements GestionProfesor {

    // CLASE
    protected static int indexTeacher = 1;

    // OBJETO
    protected float salary;
    protected int index;

    public Profesor(String name, float salary) {

	this.name = name;
	this.salary = salary;
	index = indexTeacher;

	indexTeacher++;
    }

    @Override
    public String numberType() {
	return String.format("Soy el profesor numero %d", index);
    }

    @Override
    public void validate() {
	this.valid = true;
    }

    @Override
    public void aumentarSueldo(int porcentaje) {
	this.salary *= porcentaje / 100 + 1;
    }

    @Override
    public String toString() {
	return "Profesor " + super.toString() + String.format(" Sueldo: %.2f", salary);
    }

}
