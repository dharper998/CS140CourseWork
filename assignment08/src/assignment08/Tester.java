package assignment08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tester {
	public static void main(String[] args) {
		Student john = new Student("John", 20);
		Student jane = new Student("Jane", 10);
		Student chris = new Student("Chris", 30);
		Student amy = new Student("Amy", 15);
		Student andrew = new Student("Andrew", 40);
		Student ben = new Student("Ben", 0);
		
		Major cs = new Major("Computer Science");
		Major econ = new Major("Economics");
		
		cs.addStudent(chris);
		cs.addStudent(ben);
		cs.addStudent(jane);
		
		econ.addStudent(andrew);
		econ.addStudent(amy);
		econ.addStudent(john);
		
		List<Major> majors = new ArrayList<Major>(Arrays.asList(cs, econ));
		System.out.println(getSortedList(majors));
	}
	
	public static List<Student> getSortedList(List<Major> lst) {
		return lst.stream()
			.flatMap(e -> e.getStudentsInMajor().stream())
			.sorted((s1, s2) -> s1.compare(s1, s2))
			.collect(Collectors.toList());
	}
}
