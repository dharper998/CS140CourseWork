package lab04;

public class RosterTester{
  public static void main(String[] args) {
    Roster testRoster1 = new Roster();

    Student john = new Student(5, "John");
    Student jane = new Student(2, "Jane");
    Student amy = new Student(9, "Amy");
    Student mark = new Student(7, "Mark");
    Student tony = new Student(1, "Tony");

    testRoster1.addStudent(john);
    testRoster1.addStudent(jane);
    testRoster1.addStudent(amy);
    testRoster1.addStudent(mark);
    testRoster1.addStudent(tony);

    System.out.println(testRoster1);

    testRoster1.dropStudent("Tony");

    System.out.println(testRoster1);

    testRoster1.sortByID();

    System.out.println(testRoster1);

    for(Student s : testRoster1.getClassRoster()){
      System.out.println("Name: " + s.getName() + " ID: " + s.getID());
    }
  }
}
