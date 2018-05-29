package assignment04;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Elevator {
  private int currentFloor;
  private List<Passenger> occupants = new ArrayList<>();
  private List<Line> lines = new ArrayList<>();
  private int groundFloor;
  private Direction currentDir = Direction.UP;
  private int capacity;
  private int numFloors;

  public Elevator(int nf, int gf, int cap) {
    capacity = cap;
    numFloors = nf;
    groundFloor = gf;
    currentFloor = gf;
    for(int i=0;i<numFloors;i++) {
      lines.add(null);
    }
  }

  public int getNumFloors() {
    return numFloors;
  }

  public int getCurrentFloor() {
    return currentFloor;
  }

  public Direction getCurrentDir() {
    return currentDir;
  }

  public List<Line> getLines() {
    return lines;
  }

  public int getNumOccupants() {
    return occupants.size();
  }

  public String getFloorName(int index) {
    if(index < 0 || index >= numFloors) {
      throw new IllegalArgumentException("Illegal floor number");
    }

    if(index == groundFloor) {
      return "G";
    } else if(index < groundFloor) {
      return "B" + (groundFloor - index);
    } else {
      return "" + (index - groundFloor + 1);
    }
  }

  /**
  Takes in the name of a certain floor as a string and converts it into the proper
  index for that floor
  @param <floor> The name for the floor that the method gets the index for
  @return The index of the given floor name
  */
  public int getFloorIndex(String floor) {
    int returnIndex = 0;
    if(floor == "G") {
      return groundFloor;
    } else if(floor.startsWith("B")) {
      returnIndex = groundFloor - Integer.parseInt(floor.substring(1));
      return returnIndex;
    } else {
      returnIndex = Integer.parseInt(floor) + groundFloor - 1;
      return returnIndex;
    }
  }

  public boolean addOccupants(Passenger p) {
    if (occupants.size() < capacity) {
      occupants.add(p);
      return true;
    } else {
      return false;
    }
  }

  public void addLine(String flr, Line ln) {
    if(flr == "G") {
      lines.set(groundFloor, ln);
    } else if(flr.startsWith("B")) {
      lines.set((groundFloor - Integer.parseInt(flr.substring(1))), ln);
    } else {
      lines.set((Integer.parseInt(flr) + groundFloor -1), ln);
    }
  }

  /**
  Moves the elevator by one floor in its current direction. If the elevator is
  at the max or min floors it changes direction and begins to move again. If the
  elevator has occupants whose destination floor is its current floor, it removes
  all of its occupants. If there are passengers waiting in line at the current floor
  and the elevator is not full, they are added to its occupants
  */
  public void move() {
    if(currentDir == Direction.UP && currentFloor < numFloors - 1) {
      currentFloor += 1;
    } else if(currentDir == Direction.UP && currentFloor == numFloors - 1) {
      currentDir = Direction.DOWN;
      currentFloor -= 1;
    } else if(currentDir == Direction.DOWN && currentFloor > 0) {
      currentFloor -= 1;
    } else if(currentDir == Direction.DOWN && currentFloor == 0) {
      currentDir = Direction.UP;
      currentFloor += 1;
    }

    Iterator<Passenger> iter = occupants.iterator();
    while(iter.hasNext()){
      Passenger p = iter.next();
      if(currentFloor == getFloorIndex(p.getDestinationFloor())) {
        iter.remove();
      }
    }

    if(lines.get(currentFloor) != null){
      lines.get(currentFloor).loadElevator();
    }
  }

  public void addPassengerToLine(int numPassengers, Line ln, String destinationFloor) {
    for(int i = 0;i<numPassengers;i++){
      Passenger p = new Passenger(destinationFloor, this);
      ln.addPassenger(p);
    }
  }
}
