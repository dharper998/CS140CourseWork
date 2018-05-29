package assignment01;

public class Driver4 {
	public static void main(String[] args) {
		Name jane = new Name("Jane");
		Name john = new Name("John");
		Name james = new Name("James");
		jane.befriend(john);
		jane.befriend(james);
		System.out.println(jane.getFriendNames());
		System.out.println(jane.getFriendCount());
		jane.unfriend(john);
		System.out.println(jane.getFriendNames());
		System.out.println(jane.getFriendCount());
	}
}