package assignment02;

public class Balloon {
	private double radius = 0.0;

	public void inflate(double amount) {
		radius += amount;
	}

	public void inflatePct(double amount) {
		radius += (radius * (amount / 100.0));
	}

	public double getVolume() {
		return (4 * Math.PI * radius * radius * radius / 3);
	}

	public void doubleVolume() {
		double doubleVolume = this.getVolume() * 2;
		radius = Math.cbrt(doubleVolume * 3 / 4 / Math.PI);
	}
}
