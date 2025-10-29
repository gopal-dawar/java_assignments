package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TotalSalarPerDepartment_40 {
	public static void main(String[] args) {
		List<Emp3> emp = Arrays.asList(new Emp3(101, "Gopal", "IT", 60000), new Emp3(102, "Ravi", "HR", 50000),
				new Emp3(103, "Priya", "Finance", 75000), new Emp3(104, "Amit", "IT", 62000),
				new Emp3(105, "Neha", "Marketing", 58000), new Emp3(106, "Suresh", "Finance", 70000),
				new Emp3(107, "Rita", "Operations", 55000));

		Map<String, Double> a = emp.stream()
				.collect(Collectors.groupingBy(Emp3::getDepartments, Collectors.summingDouble(Emp3::getSalary)));

		System.out.println(a);

	}
}

class Emp3 {
	private int id;
	private String name;
	private String departments;
	private int salary;

	public Emp3(int id, String name, String departments, int salary) {
		this.id = id;
		this.name = name;
		this.departments = departments;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	public String getDepartments() {
		return departments;
	}

	@Override
	public String toString() {
		return "Emp3 [id=" + id + ", name=" + name + ", departments=" + departments + ", salary=" + salary + "]";
	}

}