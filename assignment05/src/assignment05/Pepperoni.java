package assignment05;

public class Pepperoni extends PizzaTopping{
	public Pepperoni(Pizza p) {
		super(p);
	}
	
	public double getCost() {
		return 0.20 + getOn().getCost();
	}
}
