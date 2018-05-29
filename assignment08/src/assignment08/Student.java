package assignment08;

import java.util.Comparator;

public class Student implements Comparator<Student>{
	private String name;
	private int numCreditsCompleted;
	private String major = "undeclared";
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getName() {
		return name;
	}
	
	public int getNumCreditsCompleted() {
		return numCreditsCompleted;
	}
	
	public Student(String name, int numCreditsCompleted) {
		this.name = name;
		this.numCreditsCompleted = numCreditsCompleted;
	}
	
	public String toString() {
		return name + " (" + major + " : " + numCreditsCompleted + ")";
	}
	
	public int compare(Student s1, Student s2) {
		return s1.getNumCreditsCompleted() - s2.getNumCreditsCompleted();
	}
}
