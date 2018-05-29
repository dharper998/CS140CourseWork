package assignment05;

public class Sausage extends PizzaTopping{
	public Sausage(Pizza p) {
		super(p);
	}
	
	public double getCost() {
		return 0.30 + getOn().getCost();
	}
}
