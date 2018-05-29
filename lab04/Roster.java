package lab04;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Roster {
	private List<Student> classRoster = new ArrayList<>();

	public List<Student> getClassRoster() {
		return classRoster;
	}

	public void addStudent(Student s) {
		classRoster.add(s);
	}

	public void dropStudent(String name) {
		for(int i=0;i<classRoster.size();i++) {
			if(classRoster.get(i).getName() == name) {
				classRoster.remove(i);
			}
		}
	}

	public String toString() {
		String returnString = classRoster.get(0).getName();
		for(int i=1;i<classRoster.size();i++) {
			returnString += (", " + classRoster.get(i).getName());
		}
		return("[" + returnString + "]");
	}

	public void sortByID() {
		for(int i=0;i<classRoster.size();i++) {
			for(int j=1;j<classRoster.size();j++) {
				if(classRoster.get(j-1).getID() > classRoster.get(j).getID()) {
					Student temp = classRoster.get(j-1);
					classRoster.set(j-1, classRoster.get(j));
					classRoster.set(j, temp);
				}
			}
		}
	}
}
