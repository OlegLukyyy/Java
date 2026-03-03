package ejercicios7Interfaces.ejercicio1;

public class Alumno extends Persona implements GestionAlumno {

    // CLASE
    protected static int indexStudent = 1;

    // OBJETO
    protected float[] marks = new float[3];
    protected int index;

    // INDICES
    private int indexMarks = 0;

    public Alumno(String nombre) {
	this.name = nombre;
	this.index = indexStudent;
	indexStudent++;
    }

    @Override
    public String numberType() {
	return String.format("Soy el alumno numero %d", index);
    }

    @Override
    public void validate() {
	this.valid = true;

    }

    @Override
    public void registrarNota(float nota) {
	if (indexMarks < 3) {
	    marks[indexMarks] = nota;
	    indexMarks++;
	}
    }

    @Override
    public String toString() {
	String marks = indexMarks == 0 ? "" : "\n	Notas:";

	for (int i = 0; i < indexMarks; i++) {
	    marks += String.format("\n	Nota %d %.2f ", i + 1, this.marks[i]);
	}
	return "Alumno " + super.toString() + marks;
    }
}
