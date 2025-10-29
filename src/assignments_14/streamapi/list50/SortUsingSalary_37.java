package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortUsingSalary_37 {
	public static void main(String[] args) {
		List<Employee2> employees = Arrays.asList(new Employee2(101, "Gopal", "IT", 60000),
				new Employee2(102, "Ravi", "HR", 50000), new Employee2(103, "Priya", "Finance", 75000),
				new Employee2(104, "Amit", "IT", 62000), new Employee2(105, "Neha", "Marketing", 58000),
				new Employee2(106, "Suresh", "Finance", 70000), new Employee2(107, "Rita", "Operations", 55000));

		employees.stream().sorted(Comparator.comparing(Employee2::getSalary)).forEach(System.out::println);
		;

	}
}

class Employee2 {
	private int id;
	private String name;
	private String department;
	private int salary;

	public Employee2(int id, String name, String department, int salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Emp id : " + id + "\nName : " + name + "\nDepartment : " + department + "\nSalary : " + salary + "\n";
	}

}