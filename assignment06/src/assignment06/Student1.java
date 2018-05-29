package assignment06;

import java.time.LocalDate;
import java.util.Comparator;

public class Student1 implements Comparable<Student1> {
	private Person1 individual;
	private double gpa;

	public Student1(String fstN, String lstN, long n, LocalDate d, double g) {
		individual = new Person1(fstN, lstN, n, d);
		gpa = g;
	}

	public int compareTo(Student1 arg0) {
		return individual.compareTo(arg0.individual);
	}

	public int bySSN(Student1 arg0) {
		return individual.bySSN(arg0.individual);
	}

	public int byDOB(Student1 arg0) {
		return individual.byDOB(arg0.individual);
	}

	public String toSSN() {
		return individual.toSSN();
	}
	
	public int byGPA(Student1 arg0) {
		if(gpa == arg0.gpa) {
			return 0;
		} else if(gpa > arg0.gpa) {
			return 1;
		} else {
			return -1;
		}
	}	
}
