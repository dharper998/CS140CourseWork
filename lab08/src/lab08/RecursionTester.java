package lab08;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursionTester {

	@Test
	void testFactorial1() {
		try {
			assertEquals(Recursion.factorial(0), 1);
		} catch(AssertionError e) {
			fail("Recursion's factorial method failed");
		}
	}
	
	@Test
	void testFactorial2() {
		try {
			assertEquals(Recursion.factorial(1), 1); 
		} catch(AssertionError e) {
			fail("Recursion's factorial method failed");
		}
	}

	@Test
	void testFactorial3() {
		try {
			assertEquals(Recursion.factorial(4), 24);
		} catch(AssertionError e) {
			fail("Recursion's factorial method failed");
		}
	}
	
	@Test
	void testSquareRoot1() {
		try {
			assertEquals(Recursion.squareRoot(0.0), 0.0);
		} catch(AssertionError e) {
			fail("Recusrion's square root method failed");
		}
	}
	
	@Test
	void testSquareRoot2() {
		System.out.println(Recursion.squareRoot(25.0));
		try {
			assertEquals(Recursion.squareRoot(25.0), 5.0, 1e-6);
		} catch(AssertionError e) {
			fail("Recusrion's square root method failed");
		}
	}
	
	@Test
	void testSumArrayList() {
		ArrayList<Integer> sumList = new ArrayList<>();
		sumList.add(2);
		sumList.add(3);
		sumList.add(4);
		try {
			assertEquals(Recursion.sum(sumList), 9);
		} catch(AssertionError e) {
			fail("Recursion's Sum Array List method failed");
		}
	}
	
	@Test
	void testSumArray() {
		int[] sumList = {2, 3, 4};
		try {
			assertEquals(Recursion.sum(sumList), 9);
		} catch(AssertionError e) {
			fail("Recursion's Sum Array method failed");
		}
	}
	
	@Test
	void testBinomialCoefficient1() {
		try {
			assertEquals(Recursion.binomialCoefficient(4, 1), 4);
		} catch(AssertionError e) {
			fail("Recursion's Binomial Coefficient method failed");
		}
	}
	
	@Test
	void testBinomialCoefficient2() {
		try {
			assertEquals(Recursion.binomialCoefficient(4, 3), 4);
		} catch(AssertionError e) {
			fail("Recursion's Binomial Coefficient method failed");
		}
	}
}
