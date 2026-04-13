package ejercicioss12Arboles;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Employee implements Comparable<Employee> {
	private Key key;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;

	Employee(String name, Category category, LocalDate startDate, LocalDate endDate) {
		this.name = name;
		this.key = new Key(category);
		this.startDate = startDate;
		this.endDate = endDate; // ← no hardcodear null
	}

	private Employee(Employee employee) {
		this.name = employee.name;
		this.key = employee.key; // ← copia la referencia, no this.key
		this.startDate = employee.startDate;
		this.endDate = employee.endDate;
	}

	public Employee copy() {
		return new Employee(this);
	}

	public long daysWorked() {
		LocalDate end = endDate != null ? endDate : LocalDate.now(); // ← manejar null
		return ChronoUnit.DAYS.between(startDate, end);
	}

	@Override
	public int compareTo(Employee other) {
		int cmp = Long.compare(other.daysWorked(), this.daysWorked()); // desc por días
		if (cmp != 0)
			return cmp;
		return this.name.compareTo(other.name); // asc alfabético
	}

	@Override
	public String toString() {
		return "Employee [key=" + key + ", name=" + name + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", daysWorked=" + daysWorked() + "]";
	}

	public Key getKey() {
		return key;
	}

	public String getName() {
		return name;
	}
}