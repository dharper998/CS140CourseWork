package assignment05;

import java.util.ArrayList;


public class ChoiceQuestion extends Question {
	private ArrayList<String> choices;
	
	public ChoiceQuestion(String qText) {
		super(qText, "");
		choices = new ArrayList<>();
	}
	
	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if (correct) {
			// Convert choices.size() to string
			String choiceString = "" + choices.size();
			setAnswer(choiceString);
		}
	}
	
	public void display() {
		// Display the question text
		super.display();
		// Display the answer choices
		for (int i = 0; i < choices.size(); i++) {
			System.out.println((i+1) + ": " + choices.get(i));     
		}
	}
}
