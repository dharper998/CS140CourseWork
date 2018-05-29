package assignment05;

public class LargeSheetPizza implements Pizza {
	public String getDescription() {
		return "Large sheet pizza";
	}
	
	public double getCost() {
		return 20.0;
	}
	
	public int compareTo(Pizza pizza) {
		return 1;
	}
}
