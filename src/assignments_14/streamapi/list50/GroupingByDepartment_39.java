package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByDepartment_39 {
	public static void main(String[] args) {
		List<Emp2> emp = Arrays.asList(new Emp2(101, "Gopal", "IT", 60000), new Emp2(102, "Ravi", "HR", 50000),
				new Emp2(103, "Priya", "Finance", 75000), new Emp2(104, "Amit", "IT", 62000),
				new Emp2(105, "Neha", "Marketing", 58000), new Emp2(106, "Suresh", "Finance", 70000),
				new Emp2(107, "Rita", "Operations", 55000));
 
		Map<String, List<Emp2>> group = emp.stream().collect(Collectors.groupingBy(Emp2::getDepartments));

		System.out.println(group);
	}
}

class Emp2 {
	private int id;
	private String name;
	private String departments;
	private int salary;

	public Emp2(int id, String name, String departments, int salary) {
		this.id = id;
		this.name = name;
		this.departments = departments;
		this.salary = salary;
	}

	public String getDepartments() {
		return departments;
	}

	@Override
	public String toString() {
		return "Emp2 [id=" + id + ", name=" + name + ", departments=" + departments + ", salary=" + salary + "]";
	}

}