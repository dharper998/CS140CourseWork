package assignment07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetGenerator {
	
	public static void main(String[] args) {
		System.out.println(subSet("rum"));
		ArrayList<Integer> testArray = new ArrayList<Integer>();
		testArray.add(1);
		testArray.add(7);
		testArray.add(2);
		testArray.add(9);
		System.out.println(subLists(testArray));
	}
	
	public static List<String> subSet(String base) {
		List<String> retList = new ArrayList<>();
		return subSetHelper(base, retList);
	}
	
	public static List<String> subSetHelper(String base, List<String> temp) {
		if(base.length()==1) {
			temp.add(base);
			temp.add("");
			return temp;
		} else {
			temp.add(base);
			String firstChar = base.substring(0, 1);
			String ending = base.substring(1);
			for(int i=0;i<ending.length();i++) {
				String smallBase = firstChar + ending.charAt(i);
				for (int j=i+1;j<ending.length();j++) {
					if(!temp.contains(smallBase + ending.charAt(j))) {
						temp.add(smallBase + ending.charAt(j));
					}
				}
				if(!temp.contains(smallBase)) {
					temp.add(smallBase);
				}
			}
			temp.add(firstChar);
			return subSetHelper(base.substring(1), temp);
		}
	}
	
	public static <T> ArrayList<ArrayList<ArrayList<T>>> subLists(ArrayList<T> list) {
		ArrayList<ArrayList<ArrayList<T>>> retArray = new ArrayList<ArrayList<ArrayList<T>>>();
		return subListHelper(retArray, list);
	}
	
	public static <T> ArrayList<ArrayList<ArrayList<T>>> subListHelper(ArrayList<ArrayList<ArrayList<T>>> retArray, ArrayList<T> list) {
		
		if(list.size() == 1) {
			ArrayList<ArrayList<ArrayList<T>>> baseList = new ArrayList<ArrayList<ArrayList<T>>>();
			ArrayList<ArrayList<T>> baseList2 = new ArrayList<ArrayList<T>>(Arrays.asList(list));
			baseList.add(baseList2);
			return baseList;
		}
		ArrayList<ArrayList<ArrayList<T>>> temp = new ArrayList<ArrayList<ArrayList<T>>>();
		ArrayList<ArrayList<ArrayList<T>>> newRetArray = (ArrayList<ArrayList<ArrayList<T>>>) retArray.clone();
		ArrayList<T> smallList = (ArrayList<T>) list.clone();
		smallList.remove(smallList.size()-1);
		temp = subListHelper(retArray, smallList);
		ArrayList<T> elementArr = new ArrayList<T>();
		elementArr.add(list.get(list.size()-1));
		
		ArrayList<T> elementArr2 = (ArrayList<T>) elementArr.clone();		
		
		for(ArrayList<ArrayList<T>> sublist : temp) {
			ArrayList<ArrayList<T>> newList = (ArrayList<ArrayList<T>>) sublist.clone();
			newList.add(elementArr);
			newRetArray.add(newList);
		}
		
		ArrayList<T> listClone = (ArrayList<T>) list.clone();

		
		for(ArrayList<ArrayList<T>> sublist : temp) {
			ArrayList<ArrayList<T>> newList = (ArrayList<ArrayList<T>>) sublist.clone();
			ArrayList<T> newSmall = (ArrayList<T>) newList.get(newList.size()-1).clone();
			newSmall.add(listClone.get(listClone.size()-1));
			newList.set(newList.size()-1, newSmall);
			newRetArray.add(newList);
		}
		
		return newRetArray;
	}
}

/*
ruma, rum, rua, ru, rma, rm, ra, r, uma, um, ua, u, ma, m, a


[1, 7, 2, 9, 5]
[[[1], [7], [2], [9], [5]], 
[[1, 7], [2], [9], [5]], 
[[1], [7, 2], [9], [5]], 
[[1, 7, 2], [9], [5]],
[[1, 7], [2, 9], [5]], 
[[1], [7], [2, 9], [5]], 
[[1], [7, 2, 9], [5]], 
[[1, 7, 2, 9], [5]], 

[[1], [7], [2], [9, 5]]
[[1, 7], [2], [9, 5]]
[[1], [7, 2], [9, 5]]
[[1, 7, 2], [9, 5]]
[[1, 7], [2, 9, 5]]
[[1], [7], [2, 9, 5]]
[[1], [7, 2, 9, 5]]
[[1, 7, 2, 9, 5]]

[[1], [7], [2]]
[[1, 7], [2]]
[[1], [7, 2]]
[[1, 7, 2]]

*/