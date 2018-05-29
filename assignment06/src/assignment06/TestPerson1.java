package assignment06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPerson1 {

	@Test
	void testSSNSort() {
		Person1 p1 = new Person1("John", "Smith", 22345, LocalDate.of(2018, 1, 1));
		Person1 p2 = new Person1("Jane", "Doe", 12345, LocalDate.of(2018,  1,  2));
		Person1 p3 = new Person1("Alex", "Jones", 42345, LocalDate.of(2018, 1, 4));
		Person1 p4 = new Person1("Amy", "James", 32345, LocalDate.of(2018,  1,  3));
		List<Person1> test = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		List<Person1> expected = new ArrayList<>(Arrays.asList(p2,p1,p4,p3));
		
		Person1 temp;
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
			fail("Person1s were not correctly sorted by SSN");
		}
	}
	
	@Test
	void testNameSort() {
		Person1 p1 = new Person1("John", "Smith", 22345, LocalDate.of(2018, 1, 1));
		Person1 p2 = new Person1("Jane", "Doe", 12345, LocalDate.of(2018,  1,  2));
		Person1 p3 = new Person1("Alex", "Jones", 42345, LocalDate.of(2018, 1, 4));
		Person1 p4 = new Person1("Amy", "James", 32345, LocalDate.of(2018,  1,  3));
		List<Person1> test = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		List<Person1> expected = new ArrayList<>(Arrays.asList(p2,p4,p3,p1));
		Person1 temp;
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
			fail("Person1s were not correctly sorted by name");
		}
	}
	
	@Test
	void testDateSort() {
		Person1 p1 = new Person1("John", "Smith", 22345, LocalDate.of(2018, 1, 1));
		Person1 p2 = new Person1("Jane", "Doe", 12345, LocalDate.of(2018,  1,  2));
		Person1 p3 = new Person1("Alex", "Jones", 42345, LocalDate.of(2018, 1, 4));
		Person1 p4 = new Person1("Amy", "James", 32345, LocalDate.of(2018,  1,  3));
		List<Person1> test = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		List<Person1> expected = new ArrayList<>(Arrays.asList(p1,p2,p4,p3));
		Person1 temp;
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
			fail("Person1s were not correctly sorted by name");
		}
	}

}
