package lab08;

import java.util.ArrayList;

public class Bonus {
	public static void main(String[] args) {
		printPascalsTriangle(5);
	}
	
	public static void printPascalsTriangle(int limit) {
		ArrayList<Integer> start = new ArrayList<>();
		start.add(1);
		for(int i=0;i<=limit;i++) {
			for(Integer x : start) {
				System.out.print(x + " ");
			}
			start = newArray(start);
			System.out.println("");

		}
	}
	
	public static ArrayList<Integer> newArray(ArrayList<Integer> previous) {
		ArrayList<Integer> next = new ArrayList<>();
		for(int i=0;i<previous.size();i++) {
			if(i==0) {
				next.add(1);
			} else {
				next.add(previous.get(i) + previous.get(i-1));
			}
		}
		next.add(1);
		return next;
	}
}
