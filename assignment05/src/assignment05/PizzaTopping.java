package assignment05;

public abstract class PizzaTopping implements Pizza {
	private Pizza on;
	
	public String getDescription() {
		String retString = getClass().getSimpleName();
		if(on instanceof PizzaTopping) {
			retString += ", " + on.getDescription();
		} else {
			retString += " on " + on.getDescription();
		}
		return retString;
	}
	
	public Pizza getOn() {
		return on;
	}
	
	public void setOn(Pizza inOn) {
		on = inOn;
	}
	
	public PizzaTopping(Pizza p) {
		on = p;
	}
	
	public int compareTo(Pizza p) {
		int retVal = -1;
		if(p instanceof PizzaTopping) {
			retVal = getClass().getSimpleName().compareTo(p.getClass().getSimpleName());
		}
		
		return retVal;
	}
}
