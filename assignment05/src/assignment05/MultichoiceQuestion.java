package assignment05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class MultichoiceQuestion extends Question {
	private List<String> choices = new ArrayList<>();
	private List<Integer> correctChoices = new ArrayList<>();

	public MultichoiceQuestion(String qText) {
		super(qText, "");
	}
	
	public void addChoice(String choice, boolean correct) {
		choices.add(choice);
		if (correct) {
			correctChoices.add(choices.size());
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
	
	@Override
	public void presentQuestion() {
		display();
		System.out.print("Your answers (if more than one, separate answers by spaces): ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println(checkAnswer(response));
	}
	
	@Override
	public boolean checkAnswer(String response) {
		int correctCounter = 0;
		int incorrectCounter = 0;
		Set<Integer> answers = new HashSet<>();
		
		try(Scanner scan = new Scanner(response)) {
			while(scan.hasNextInt()) {
				int ans = scan.nextInt();
				answers.add(ans);
			}
		}
		
		for(Integer answer : answers) {
			if(correctChoices.contains(answer)) {
				correctCounter += 1;
			} else {
				incorrectCounter += 1;
			}
		}
		
		if(correctChoices.size() == correctCounter && incorrectCounter == 0) {
			return true;
		} else {
			System.out.println("Correct: " + correctCounter + ", Incorrect: " + incorrectCounter);
			return false;
		}
	}
}
