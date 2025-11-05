package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExtractUniqueDepartment_36 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee(101, "Gopal", "IT"), new Employee(102, "Ravi", "HR"),
				new Employee(103, "Priya", "Finance"), new Employee(104, "Amit", "IT"),
				new Employee(105, "Neha", "Marketing"), new Employee(106, "Suresh", "Finance"),
				new Employee(107, "Rita", "Operations"));

		List<String> i = employees.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
		
		System.out.println(i);
	}
}

class Employee {
	private int id;
	private String name;
	private String department;

	public Employee(int id, String name, String department) {
		this.id = id;
		this.name = name;
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	@Override
	public String toString() {
		return "Emp id : " + id + "\nName : " + name + "\nDepartment : " + department + "\n";
	}

}