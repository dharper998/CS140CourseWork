package lab07;

public class Tiger extends Carnivore {
	private String name;
	
	public String getName() {
		return name;
	}

	public Tiger(String preyIn, int levelIn, String nameIn) {
		super(preyIn, levelIn);
		name = nameIn;
	}
	
	@Override
	public String toString() {
		return "Tigers are a predator of Asia, known for their stripes.";
	}
	
	@Override
	public String getAnimalName() {
		return name;
	}
	
	public void speak() {
		System.out.println("Growl!");
	}
	
	public void eat() {
		System.out.println(name + "the Tiger eats" + super.getPrey());
	}
	
	public void move() {
		System.out.println("Tigers move gracefully due to their powerful leg and shoulder muscles.");
	}
	
	public void sleep() {
		System.out.println("Tigers like to sleep in rocky places, grassy areas, or inside caves.");
	}
	
	public String kingdom() {
		return "Animalia";
	}
	
	public String genus() {
		return "Panthera";
	}
	
	public String species() {
		return "P.tigris (tiger)";
	}
	
	public void prowl() {
		System.out.println("The tiger pounces on an unsuspecting" + super.getPrey());
	}
	
}
