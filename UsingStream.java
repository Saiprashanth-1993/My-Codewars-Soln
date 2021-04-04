import java.util.ArrayList;
import java.util.List;

class Employee {

	private String name;

	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class UsingStream {
	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.stream()
			   .filter(e -> e.getName()
					   		 .startsWith("s"))
			   .forEach(System.out::println);
	}
}
