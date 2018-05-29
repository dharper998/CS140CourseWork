package assignment06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestStudent1 {

	@Test
	void testSSNSort() {
		Student1 p1 = new Student1("John", "Smith", 22345, LocalDate.of(2018, 1, 1), 4.0);
		Student1 p2 = new Student1("Jane", "Doe", 12345, LocalDate.of(2018,  1,  2), 3.5);
		Student1 p3 = new Student1("Alex", "Jones", 42345, LocalDate.of(2018, 1, 4), 2.0);
		Student1 p4 = new Student1("Amy", "James", 32345, LocalDate.of(2018,  1,  3), 2.5);
		List<Student1> test = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		List<Student1> expected = new ArrayList<>(Arrays.asList(p2,p1,p4,p3));
		
		Student1 temp;
		for(int i=1 ; i<test.size() ; i++) {
			for(int j=i ; j>0 ; j--) {
				if(test.get(j).bySSN(test.get(j-1)) < 0) {
					temp = test.get(j);
					test.set(j, test.get(j-1));
					test.set(j-1,  temp);
				}
			}
		}
		
		try {
			assertEquals(expected, test);
		} catch(AssertionError e) {
			fail("Student1s were not correctly sorted by SSN");
		}
	}
	
	@Test
	void testNameSort() {
		Student1 p1 = new Student1("John", "Smith", 22345, LocalDate.of(2018, 1, 1), 4.0);
		Student1 p2 = new Student1("Jane", "Doe", 12345, LocalDate.of(2018,  1,  2), 3.5);
		Student1 p3 = new Student1("Alex", "Jones", 42345, LocalDate.of(2018, 1, 4), 2.0);
		Student1 p4 = new Student1("Amy", "James", 32345, LocalDate.of(2018,  1,  3), 2.5);
		List<Student1> test = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		List<Student1> expected = new ArrayList<>(Arrays.asList(p2,p4,p3,p1));
		Student1 temp;
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
			fail("Student1s were not correctly sorted by name");
		}
	}
	
	@Test
	void testDateSort() {
		Student1 p1 = new Student1("John", "Smith", 22345, LocalDate.of(2018, 1, 1), 4.0);
		Student1 p2 = new Student1("Jane", "Doe", 12345, LocalDate.of(2018,  1,  2), 3.5);
		Student1 p3 = new Student1("Alex", "Jones", 42345, LocalDate.of(2018, 1, 4), 2.0);
		Student1 p4 = new Student1("Amy", "James", 32345, LocalDate.of(2018,  1,  3), 2.5);
		List<Student1> test = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		List<Student1> expected = new ArrayList<>(Arrays.asList(p1,p2,p4,p3));
		Student1 temp;
		for(int i=1 ; i<test.size() ; i++) {
			for(int j=i ; j>0 ; j--) {
				if(test.get(j).byDOB(test.get(j-1)) < 0) {
					temp = test.get(j);
					test.set(j, test.get(j-1));
					test.set(j-1,  temp);
				}
			}
		}
		try {
			assertEquals(expected, test);
		} catch(AssertionError e) {
			fail("Student1s were not correctly sorted by name");
		}
	}
	
	@Test
	void testGPASort() {
		Student1 p1 = new Student1("John", "Smith", 22345, LocalDate.of(2018, 1, 1), 4.0);
		Student1 p2 = new Student1("Jane", "Doe", 12345, LocalDate.of(2018,  1,  2), 3.5);
		Student1 p3 = new Student1("Alex", "Jones", 42345, LocalDate.of(2018, 1, 4), 2.0);
		Student1 p4 = new Student1("Amy", "James", 32345, LocalDate.of(2018,  1,  3), 2.5);
		List<Student1> test = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		List<Student1> expected = new ArrayList<>(Arrays.asList(p3,p4,p2,p1));
		Student1 temp;
		for(int i=1 ; i<test.size() ; i++) {
			for(int j=i ; j>0 ; j--) {
				if(test.get(j).byGPA(test.get(j-1)) < 0) {
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
}