package assignment06;

import java.time.LocalDate;
import java.util.Comparator;

public class Person1 implements Comparable<Person1> {
	private String firstName;
	private String lastName;
	private long ssn;
	private LocalDate dob;

	public Person1(String fstN, String lstN, long n, LocalDate d) {
		firstName = fstN;
		lastName = lstN;
		ssn = n;
		dob = d;
	}

	@Override
	public int compareTo(Person1 arg0) {
		if(arg0.lastName.equals(lastName)) {
			if(arg0.firstName.equals(firstName)) {
				return 0;
			} else {
				return firstName.compareTo(arg0.firstName);
			}
		} else {
			return lastName.compareTo(arg0.lastName);
		}
		 
	}

	public int bySSN(Person1 arg0) {
		if(arg0.ssn == ssn) {
			return 0;
		} else if(ssn > arg0.ssn) {
			return 1;
		} else {
			return -1;
		}
	}

	public int byDOB(Person1 arg0) {
		if(dob.getYear() == arg0.dob.getYear()) {
			if(dob.getMonthValue() == arg0.dob.getMonthValue()) {
				if(dob.getDayOfMonth() == arg0.dob.getDayOfMonth()) {
					return 0;
				} else if(dob.getDayOfMonth() > arg0.dob.getDayOfMonth()) {
					return 1;
				} else {
					return -1;
				}
			} else if(dob.getMonthValue() > arg0.dob.getMonthValue()) {
				return 1;
			} else {
				return -1;
			}
		} else if(dob.getYear() > arg0.dob.getYear()) {
			return 1;
		} else {
			return -1;
		}
	}

	public String toSSN() {
		String s = "000000000" + ssn;
		s = s.substring(s.length()-9);
		return s.substring(0, 3) + "-" + s.substring(3, 5) 
		+ "-" + s.substring(5); 
	}
}
