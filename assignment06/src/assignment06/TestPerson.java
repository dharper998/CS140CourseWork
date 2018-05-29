package assignment06;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPerson {

	@Test
	void testSSNSort() {
		Person p1 = new Person("John", "Smith", 22345, LocalDate.of(2018, 1, 1));
		Person p2 = new Person("Jane", "Doe", 12345, LocalDate.of(2018,  1,  2));
		Person p3 = new Person("Alex", "Jones", 42345, LocalDate.of(2018, 1, 4));
		Person p4 = new Person("Amy", "James", 32345, LocalDate.of(2018,  1,  3));
		List<Person> test = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		List<Person> expected = new ArrayList<>(Arrays.asList(p2,p1,p4,p3));
		test.sort(Person.bySSN());
		try {
			assertEquals(expected, test);
		} catch(AssertionError e) {
			fail("Persons were not correctly sorted by SSN");
		}
	}
	
	@Test
	void testNameSort() {
		Person p1 = new Person("John", "Smith", 22345, LocalDate.of(2018, 1, 1));
		Person p2 = new Person("Jane", "Doe", 12345, LocalDate.of(2018,  1,  2));
		Person p3 = new Person("Alex", "Jones", 42345, LocalDate.of(2018, 1, 4));
		Person p4 = new Person("Amy", "James", 32345, LocalDate.of(2018,  1,  3));
		List<Person> test = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		List<Person> expected = new ArrayList<>(Arrays.asList(p2,p4,p3,p1));
		Person temp;
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
			fail("Persons were not correctly sorted by name");
		}
	}
	
	@Test
	void testDateSort() {
		Person p1 = new Person("John", "Smith", 22345, LocalDate.of(2018, 1, 1));
		Person p2 = new Person("Jane", "Doe", 12345, LocalDate.of(2018,  1,  2));
		Person p3 = new Person("Alex", "Jones", 42345, LocalDate.of(2018, 1, 4));
		Person p4 = new Person("Amy", "James", 32345, LocalDate.of(2018,  1,  3));
		List<Person> test = new ArrayList<>(Arrays.asList(p1,p2,p3,p4));
		List<Person> expected = new ArrayList<>(Arrays.asList(p1,p2,p4,p3));
		test.sort(Person.byDOB());
		try {
			assertEquals(expected, test);
		} catch(AssertionError e) {
			fail("Persons were not correctly sorted by name");
		}
	}

}
