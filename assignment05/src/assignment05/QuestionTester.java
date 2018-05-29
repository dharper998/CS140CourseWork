package assignment05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuestionTester {

	@Test
	void testChoiceCheck() {
		ChoiceQuestion choice = new ChoiceQuestion("In which country was the inventor of Java born?");
		choice.addChoice("Australia", false);
		choice.addChoice("Canada", true);
		choice.addChoice("Denmark", false);
		choice.addChoice("United States", false);
		
		try {
			assertTrue(choice.checkAnswer("2"));
		} catch (AssertionError e) {
			fail("Choice question's check answer method failed on a correct answer");
		}
		
		try {
			assertFalse(choice.checkAnswer("3"));
		} catch (AssertionError e) {
			fail("Choice question's check answer method failed on an incorrect answer");
		}
	}
	
	@Test
	void testMultiCheck() {
		MultichoiceQuestion multi = new MultichoiceQuestion("Which colleges are part of SUNY?");
		multi.addChoice("Binghamton", true);
		multi.addChoice("St. Bonaventure", false);
		multi.addChoice("Stony Brook", true);
		multi.addChoice("Elmira College", false);
		
		try {
			assertTrue(multi.checkAnswer("1 3"));
		} catch (AssertionError e) {
			fail("Multichoice question's check answer method failed on a correct answer");
		}
		
		try {
			assertFalse(multi.checkAnswer("1 2"));
		} catch (AssertionError e) {
			fail("Multichoice question's check answer method failed on an incorrect answer");
		}
	}

}
