package lab05;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Division {
	private List<Double> list = new ArrayList<>();
	
	public Division(double[] array) {
		if(array == null || array.length == 0){
			throw new IllegalArgumentException("Need to enter an array with at least one double");
		} else {
			for(double d : array) {
				list.add(d);
			}
		}
	}

	public void removeZeroes() {
		Iterator<Double> iter = list.iterator();
		while(iter.hasNext()) {
			if((Double) iter.next() ==  0.0) {
				iter.remove();
			}
		}
	}

	public void divide(int divisor) {
		if(divisor == 0) {
			throw new IllegalArgumentException("Cannot divide by zero");
		} else {
			for(int i=0;i<list.size();i++) {
				list.set(i, (list.get(i)/divisor));
			}
		}
	}

	public String toString() {
		return list.toString();
	}
}
