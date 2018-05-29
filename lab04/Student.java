package lab04;

public class Student {
	private int id;
	private String name;

	public Student(int idNum, String studentName) {
		id = idNum;
		name = studentName;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}
}
