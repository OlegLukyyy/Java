package ejercicios5This.ejercicio2;

public class Person {
    private String name;
    private int age;
    private float height;
    private String work;
    private double salary;

    public Person() {
	this.name = "unnamed";
	this.age = 0;
	this.height = 0.0f;
	this.work = "unemployment";
    }

    public Person(String name, int age, float height, String work) {
	this.name = name;
	this.age = age;
	this.height = height;
	this.work = work;
    }

    public double getSalary() {
	return salary;
    }

    public void setSalary(double salary) {
	this.salary = salary;
    }

    public void addSalary(Person person) {
	this.salary += person.salary;
    }

    public void doubleSalary() {
	addSalary(this);
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	this.age = age;
    }

    public float getHeight() {
	return height;
    }

    public void setHeight(float height) {
	this.height = height;
    }

    public String getWork() {
	return work;
    }

    public void setWork(String work) {
	this.work = work;
    }

    @Override
    public String toString() {
	return "Nombre: " + name + "\nEdad: " + age + "\nAltura: " + height + "\nTrabajo: " + work;
    }
}
