package assignment01;

public class Driver3 {
	public static void main(String[] args) {
		Balloon balloon = new Balloon();
		balloon.inflate(10.0);
		balloon.inflatePct(5);
		System.out.println("Volume: " + balloon.getVolume());
		balloon.doubleVolume();
	}
}