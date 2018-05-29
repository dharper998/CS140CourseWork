package lab04;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		List<Integer> testList1 = new ArrayList<>(Arrays.asList(1, 2, 2, 4, 5));
		List<Integer> testList2 = new ArrayList<>(Arrays.asList(6, 7, 8));
		List<Integer> testList3 = new ArrayList<>(Arrays.asList(6, 7, 8));
		List<Integer> testList4 = new ArrayList<>(Arrays.asList(10, 11, 12, 13));
		int[] testArray = {11, 12, 13};

		System.out.println(ArrayListPractice.intRemoveAll(testList1, 2));
		System.out.println(ArrayListPractice.isEqual(testList1, testList2));
		System.out.println(ArrayListPractice.isEqual(testList2, testList3));
		System.out.println(ArrayListPractice.appendArray(testList1, testArray));
		System.out.println(ArrayListPractice.sumElementWise(testList1, testList2));
		System.out.println(ArrayListPractice.sumElementWise(testList2, testList4));
	}
} 
