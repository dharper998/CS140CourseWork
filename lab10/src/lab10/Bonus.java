package lab10;

import java.util.List;
import java.util.ArrayList;

public class Bonus {
	private static List<Department> departments = new ArrayList<>();
	
	static{
		Employee john = new Employee("John Doe", 30);
		Employee jane = new Employee("Jane Deer", 25);
		Employee jack = new Employee("Jack Hill", 40);
		Employee snow = new Employee("Snow White", 22);
		
		Employee jared = new Employee("Jared Miller", 60);
		Employee jeff = new Employee("Jeff Jackson", 27);
		Employee gerald = new Employee("Gerald House", 15);
		Employee mary = new Employee("Mary Lou", 23);
		
		Department hr = new Department("Human Resources");
		hr.addEmployee(jane);
		hr.addEmployee(jack);
		hr.addEmployee(snow);
		Department accounting = new Department("Accounting");
		accounting.addEmployee(john);
		accounting.addEmployee(jared);
		accounting.addEmployee(jeff);
		accounting.addEmployee(gerald);
		accounting.addEmployee(mary);
		
		departments.add(hr);
		departments.add(accounting);
	}
	
	public static void printYoungestEmployee() {
		departments.stream()
		.peek(department -> System.out.println(department.getDepartmentName() + ": " + department.getEmployees()))
		.flatMap(e -> e.getEmployees().stream())
		.reduce((p1, p2) -> p1.getAge() < p2.getAge() ? p1:p2)
		.ifPresent(employee -> System.out.println("Youngest: " + employee));
	}
	
	public static void main(String[] args) {
		printYoungestEmployee();
	}
}
