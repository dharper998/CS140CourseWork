package assignment05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PizzaTester {

	@Test
	void testMediumCheeseCost() {
		Pizza mediumCheese = new MediumCheesePizza();
		mediumCheese = new ExtraCheese(mediumCheese);
		mediumCheese = new Pepperoni(mediumCheese);
		mediumCheese = new Sausage(mediumCheese);
		try {
			assertEquals(10.65, 10.649999999999, 1E-6);
		} catch(AssertionError e) {
			fail("Medium Cheese Pizza's Cost is incorrect");
		}
	}
	
	@Test
	void testSmallCheeseCost() {
		Pizza smallCheese = new SmallCheesePizza();
		smallCheese = new ExtraCheese(smallCheese);
		smallCheese = new Mushroom(smallCheese);
		smallCheese = new Sausage(smallCheese);
		try {
			assertEquals(10.70, 10.699999999999, 1E-6);
		} catch(AssertionError e) {
			fail("Small Cheese Pizza's Cost is incorrect");
		}	
	}
}
