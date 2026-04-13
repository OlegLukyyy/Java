package ejercicioss14Streams;

import java.util.Comparator;

public class Main {

	Database db = new Database();

	public static void main(String[] args) {
		new Main().show();
	}

	public void show() {
		showLegalAgeStudentCount();
		System.out.println("--------------------------");
		showStudentNamesOrderAlphabetically();
		System.out.println("--------------------------");
		showFistTwoStudentsNames();
		System.out.println("--------------------------");
		showStudentsNamesExceptTheFirstOne();
		System.out.println("--------------------------");
		showStudentsNamesUntilFirstNotLegalAgeOne();
		System.out.println("--------------------------");
	}

	public void showLegalAgeStudentCount() {
		long stream = db.queryAllStudents().stream().filter(x -> x.getAge() >= 18).count();
		System.out.println(stream);
	}

	public void showStudentNamesOrderAlphabetically() {
		db.queryAllStudents().stream().sorted(Comparator.comparing(x -> x.getName()))
				.forEach(x -> System.out.println(x));

	}

	public void showFistTwoStudentsNames() {
		db.queryAllStudents().stream().limit(2).forEach(x -> System.out.println(x));

	}

	public void showStudentsNamesExceptTheFirstOne() {
		db.queryAllStudents().stream().skip(1).forEach(x -> System.out.println(x));

	}

	public void showStudentsNamesUntilFirstNotLegalAgeOne() {
		db.queryAllStudents().stream().takeWhile(x -> x.getAge() >= 18).forEach(x -> System.out.println(x));
		;

	}
}
