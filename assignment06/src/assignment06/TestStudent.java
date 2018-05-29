package assignment06;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class TestStudent {
	@Test
	void testSSNSort() {
		Student p1 = new Student("John", "Smith", 22345, LocalDate.of(2018, 1, 1), 4.0);
		Student p2 = new Student("Jane", "Doe", 12345, LocalDate.of(2018,  1,  2), 3.5);
		Student p3 = new Student("Alex", "Jones", 42345, LocalDate.of(2018, 1, 4), 2.0);
		Student p4 = new Student("Amy", "James", 32345, LocalDate.of(2018,  1,  3), 2.5);
		List<Student> test = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		List<Student> expected = new ArrayList<>(Arrays.asList(p2,p1,p4,p3));
		test.sort(Student.bySSN());
		try {
			assertEquals(expected, test);
		} catch(AssertionError e) {
			fail("Students were not correctly sorted by SSN");
		}
	}
	
	@Test
	void testNameSort() {
		Student p1 = new Student("John", "Smith", 22345, LocalDate.of(2018, 1, 1), 4.0);
		Student p2 = new Student("Jane", "Doe", 12345, LocalDate.of(2018,  1,  2), 3.5);
		Student p3 = new Student("Alex", "Jones", 42345, LocalDate.of(2018, 1, 4), 2.0);
		Student p4 = new Student("Amy", "James", 32345, LocalDate.of(2018,  1,  3), 2.5);
		List<Student> test = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		List<Student> expected = new ArrayList<>(Arrays.asList(p2,p4,p3,p1));
		Student temp;
		for(int i=1 ; i<test.size() ; i++) {
			for(int j=i ; j>0 ; j--) {
				if(test.get(j).compareTo(test.get(j-1)) < 0) {
					temp = test.get(j);
					test.set(j, test.get(j-1));
					test.set(j-1,  temp);
				}
			}
		}
		try {
			assertEquals(expected, test);
		} catch(AssertionError e) {
			fail("Students were not correctly sorted by name");
		}
	}
	
	@Test
	void testDateSort() {
		Student p1 = new Student("John", "Smith", 22345, LocalDate.of(2018, 1, 1), 4.0);
		Student p2 = new Student("Jane", "Doe", 12345, LocalDate.of(2018,  1,  2), 3.5);
		Student p3 = new Student("Alex", "Jones", 42345, LocalDate.of(2018, 1, 4), 2.0);
		Student p4 = new Student("Amy", "James", 32345, LocalDate.of(2018,  1,  3), 2.5);
		List<Student> test = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		List<Student> expected = new ArrayList<>(Arrays.asList(p1,p2,p4,p3));
		test.sort(Student.byDOB());
		try {
			assertEquals(expected, test);
		} catch(AssertionError e) {
			fail("Students were not correctly sorted by name");
		}
	}
	
	@Test
	void testGPASort() {
		Student p1 = new Student("John", "Smith", 22345, LocalDate.of(2018, 1, 1), 4.0);
		Student p2 = new Student("Jane", "Doe", 12345, LocalDate.of(2018,  1,  2), 3.5);
		Student p3 = new Student("Alex", "Jones", 42345, LocalDate.of(2018, 1, 4), 2.0);
		Student p4 = new Student("Amy", "James", 32345, LocalDate.of(2018,  1,  3), 2.5);
		List<Student> test = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		List<Student> expected = new ArrayList<>(Arrays.asList(p3,p4,p2,p1));
		test.sort(Student.byGPA());
		try {
			assertEquals(expected, test);
		} catch(AssertionError e) {
			fail("Students were not correctly sorted by name");
		}
	}
}
