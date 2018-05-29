package assignment05;
import java.util.Scanner;

public class Question {
	private String text;
	private String answer;
	
	public Question(String qText, String correctResponse) {
		text = qText;
		answer = correctResponse;
	}
	
	public void setAnswer(String correctResponse) {
		answer = correctResponse;
	}

	public boolean checkAnswer(String response) {
		return response.equals(answer);
	}
	
	public void display() {
		System.out.println(text);
	}
	
	public void presentQuestion() {
		display();
		System.out.print("Your answer: ");
		Scanner in = new Scanner(System.in);
		String response = in.nextLine();
		System.out.println(checkAnswer(response));
	}

}

