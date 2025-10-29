package assignments_14.streamapi.list50;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindWithHighestSalary_38 {
	public static void main(String[] args) {
		List<Emp1> emp = Arrays.asList(new Emp1(101, "Gopal", "IT", 60000), new Emp1(102, "Ravi", "HR", 50000),
				new Emp1(103, "Priya", "Finance", 75000), new Emp1(104, "Amit", "IT", 62000),
				new Emp1(105, "Neha", "Marketing", 58000), new Emp1(106, "Suresh", "Finance", 70000),
				new Emp1(107, "Rita", "Operations", 55000));

		Optional<Emp1> n = emp.stream().max(Comparator.comparing(Emp1::getSalary));
		System.out.println(n.get());
	}
}

class Emp1 {
	private int id;
	private String name;
	private String departments;
	private int salary;

	public Emp1(int id, String name, String departments, int salary) {
		this.id = id;
		this.name = name;
		this.departments = departments;
		this.salary = salary;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Emp id : " + id + "\nName : " + name + "\nDepartments : " + departments + "\nSalary=" + salary + "\n";
	}

}