package assignment07;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class SubstringGenerator {
	
	public static void main(String[] args) {
		System.out.println(subStrings("rum"));
		System.out.println(subStrings1("rum"));
	}
	
	public static Set<String> subStrings(String base) {
		
		if(base.length() == 0) {
			TreeSet<String> startSet = new TreeSet<>();
			startSet.add("");
			return startSet;

		}
		TreeSet<String> retSet = new TreeSet<>();
		retSet.addAll(subStrings(base.substring(1)));
		if(base.length()==1) {
			retSet.add(base);
		}
		String firstChar = base.substring(0, 1);
		retSet.add(firstChar);
		
		for(int i=1;i<base.length();i++) {
			firstChar += base.charAt(i);
			retSet.add(firstChar);
		}
		
		return retSet;
	}
	
	public static List<String> subStrings1(String base) {
		ArrayList<String> retList = new ArrayList<String>();
		return subStringsHelper(base, retList);
	}
	
	public static List<String> subStringsHelper(String base, List<String> temp) {
		if(base.length() == 1) {
			temp.add(base);
			temp.add("");
			return temp;
		} else {
			String startChar = base.substring(0, 1);
			temp.add(startChar);
			for(int i=1;i<base.length();i++) {
				startChar += base.charAt(i);
				temp.add(startChar);
			}
			return subStringsHelper(base.substring(1), temp);
		}
	}
}
