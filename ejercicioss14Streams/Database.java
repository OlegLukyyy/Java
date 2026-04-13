package ejercicioss14Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Database {
	private List<Student> students;

	public Database() {
		students = new ArrayList<>();
		students.add(new Student(1, "Germán Ginés", 23, "1º CFGS DAM", 2000,
				Arrays.asList(new Grade("PROGR", 8f), new Grade("LM", 3f))));
		students.add(new Student(2, "Baldomero", 21, "1º CFGS DAM", 0,
				Arrays.asList(new Grade("PROGR", 5f), new Grade("LM", 4f))));
		students.add(new Student(3, "Ana Guerra", 17, "1º CFGM SMR", 4000, Arrays.asList(new Grade("PROGR", 8f))));
	}

	public List<Student> queryAllStudents() {
		return students;
	}
}
