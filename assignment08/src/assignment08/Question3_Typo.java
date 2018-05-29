package assignment08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Question3_Typo {

	public static void main(String[] args) {
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		testArray.add(1);
		testArray.add(7);
		testArray.add(2);
		testArray.add(9);
		testArray.add(11);
		System.out.println(windowSubLists(testArray));
	}
	
	public static <T> ArrayList<ArrayList<ArrayList<T>>> windowSubLists(ArrayList<T> list) {
		ArrayList<ArrayList<ArrayList<T>>> retArray = new ArrayList<ArrayList<ArrayList<T>>>();
		return windowSubListHelper(list, retArray, list.size()-2, list.size());
	}
	
	public static <T> ArrayList<ArrayList<ArrayList<T>>> windowSubListHelper(ArrayList<T> list, ArrayList<ArrayList<ArrayList<T>>> retArray, int begin, int end) {
		
		if(end == 0 && begin == 0) {
			ArrayList<ArrayList<T>> baseList = new ArrayList<ArrayList<T>>();
			for(T t:list) {
				baseList.add(new ArrayList<T>(Arrays.asList(t)));
			}
			retArray.add(baseList);
			return retArray;
		}
		
		ArrayList<ArrayList<T>> newList = new ArrayList<ArrayList<T>>();
		ArrayList<T> smallList = new ArrayList<T>(list.subList(begin, end));
		
		for(T t:list) {
			if(!smallList.contains(t)) {
				newList.add(new ArrayList<T>(Arrays.asList(t)));
			}
		}
		
		newList.add(begin, smallList);
		
		
		if(end == begin+2) {
			if(begin != 0) {
				retArray = windowSubListHelper(list, retArray, begin-1, list.size());
			} else {
				retArray = windowSubListHelper(list, retArray, 0, 0);
			}
		} else {
			retArray = windowSubListHelper(list, retArray, begin, end-1);
		}
				
		retArray.add(newList);
		
		return retArray;
	}
}
