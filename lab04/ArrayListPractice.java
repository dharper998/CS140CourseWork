package lab04;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class ArrayListPractice {
	public static int intRemoveAll(List<Integer> arr, int e) {
		Iterator<Integer> iter = arr.iterator();
		int removed = 0;
		while(iter.hasNext()){
			if((Integer) iter.next() == e) {
				iter.remove();
				removed += 1;
			}
		}
		return removed;
	}

	public static boolean isEqual(List<Integer> alpha, List<Integer> other) {
		if(alpha.size() != other.size()) {
			return false;
		} else{
			for(int i=0;i<alpha.size();i++) {
				if(alpha.get(i) != other.get(i)) {
					return false;
				}
			}
			return true;
		}
	}

	public static List<Integer> appendArray(List<Integer> arrList, int[] arr) {
		if(arr == null){
			throw new IllegalArgumentException("Array cannot be null");
		} else{		
			for(int i=0;i<arr.length;i++) {
				arrList.add(arr[i]);
			}
			return arrList;
		}
	}

	public static List<Integer> sumElementWise(List<Integer> arr1, List<Integer> arr2) {
		if(arr1 == null || arr2 == null) {
			throw new IllegalArgumentException("Arrays cannot be null");
		}
		
		List<Integer> returnList = new ArrayList<>();
		if(arr2.size() <= arr1.size()) {
			returnList = arr1;
			for(int i=0;i<arr2.size();i++){
				returnList.set(i, arr1.get(i) + arr2.get(i));
			}
		} else{
			for(int i=0;i<arr1.size();i++) {
				returnList.add(arr1.get(i) + arr2.get(i));
			}
			for(int i=arr1.size();i<arr2.size();i++){
				returnList.add(arr2.get(i));
			}
		}
		return returnList;
	}

}
