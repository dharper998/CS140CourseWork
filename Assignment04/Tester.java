package assignment04;

public class Tester {
  public static void main(String[] args) {
    Elevator elevator = new Elevator(15, 5, 10);
    System.out.println("Expected: 5, Result: " + elevator.getFloorIndex("G"));
    System.out.println("Expected: 3, Result: " + elevator.getFloorIndex("B2"));
    System.out.println("Expected: 11, Result: " + elevator.getFloorIndex("7"));

    System.out.println("Expected: G, Result: " + elevator.getFloorName(5));
    System.out.println("Expected: B2, Result: " + elevator.getFloorName(3));
    System.out.println("Expected: 7, Result: " + elevator.getFloorName(11));
  }
}
