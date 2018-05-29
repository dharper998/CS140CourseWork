package assignment08;

import java.util.ArrayList;
import java.util.List;

public class Major{
	private String name;
	private List<Student> studentsInMajor;
	
	public String getName() {
		return name;
	}
	
	public List<Student> getStudentsInMajor() {
		return studentsInMajor;
	}

	public Major(String name) {
		this.name = name;
		this.studentsInMajor = new ArrayList<Student>();
	}
	
	public void addStudent(Student s) {
		studentsInMajor.add(s);
		s.setMajor(this.name);
	}
	
	public void setMajors() {
		studentsInMajor.stream()
			.forEach(e -> e.setMajor(name));
	}
}
