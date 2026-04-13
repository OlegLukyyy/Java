package ejercicioss14Streams;

import java.util.List;

public class Student {
	private long id;
	private String name;
	private int age;
	private String group;
	private int grant;
	private List<Grade> grades;

	public Student(long id, String name, int age, String group, int grant, List<Grade> grades) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.group = group;
		this.grant = grant;
		this.grades = grades;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", group=" + group + ", grant=" + grant
				+ ", grades=" + grades + "]";
	}

	public String getGroup() {
		return group;
	}

	public int getGrant() {
		return grant;
	}

	public List<Grade> getGrades() {
		return grades;
	}
}