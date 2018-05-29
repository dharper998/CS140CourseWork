package assignment04;

public class Visualizer{
  public static void showElev(Elevator e) {
    for(int i = e.getNumFloors() - 1;i>=0;i--) {
      Line line = e.getLines().get(i);
      String lineStr = "";
      if(line != null){
        lineStr = "" + line.getLine();
      }
      if(i == e.getCurrentFloor()) {
        System.out.println(e.getFloorName(i) + ">\t\t" + e.getNumOccupants() + "\t\t" + lineStr);
      } else{
        System.out.println(e.getFloorName(i) + "\t\t0" + "\t\t" + lineStr);
      }
    }
    System.out.println("+++++++++++++++++++++");
  }

  public static void main(String[] args) {
    Elevator elevator = new Elevator(15, 5, 10);
    Line line1 = new Line("G", elevator);
    Line line2 = new Line("5", elevator);
    Line line3 = new Line("8", elevator);
    elevator.addPassengerToLine(6, line1, "7");
    elevator.addPassengerToLine(3, line1, "3");
    elevator.addPassengerToLine(3, line1, "B3");
    elevator.addPassengerToLine(4, line2, "2");
    elevator.addPassengerToLine(2, line3, "9");

    showElev(elevator);
    for(int i = 0; i < 35; i++) {
      showElev(elevator);
      elevator.move();
    }
  }
}
