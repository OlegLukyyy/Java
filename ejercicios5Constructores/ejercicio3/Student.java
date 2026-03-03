package ejercicios5Constructores.ejercicio3;

public class Student {

    String matricula;
    String nombre;
    float[] notas = new float[2];

    public Student(String matricula, String nombre) {

	this.matricula = matricula;
	this.nombre = nombre;

    }

    public void setMarks(float mark1, float mark2) {

	this.notas[0] = mark1;
	this.notas[1] = mark2;

    }

    public float getAverage() {
	return (notas[0] + notas[1]) / 2;
    }

    @Override
    public String toString() {
	return "Matrícula: " + matricula + "\nNombre: " + nombre + "\nNota 1: " + notas[0] + "\nNota 2: " + notas[1]
		+ "\nMedia: " + getAverage();
    }

}
