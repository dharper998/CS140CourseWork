package lab05;

import java.util.List;

public class FunWithStrings {
	public static void swapMaxes(List<String> list1, List<String> list2) {
		if(list1 == null || list2 == null || list1.size() == 0 || list2.size() == 0) {
			throw new IllegalArgumentException("Cannot swap maxes of empty lists, null lists, or lists with all null elements");
		} else {
			boolean allNull1 = true;
			for(String s : list1) {
				if(s != null) {
					allNull1 = false;
				}
			}
			boolean allNull2 = true;
			for(String s : list2) {
				if(s != null) {
					allNull2 = false;
				}
			}
			if(allNull1 || allNull2) {
				throw new IllegalArgumentException("Cannot swap maxes of empty lists, null lists, or lists with all null elements");
			} else {
				int list1MaxIndex = 0;
				String list1Max = list1.get(0);
				for(int i=1;i<list1.size();i++) {
					if(list1.get(i) != null && list1.get(i).length() > list1Max.length()) {
						list1MaxIndex = i;
						list1Max = list1.get(i);
					}
				}

				int list2MaxIndex = 0;
				String list2Max = list2.get(0);
				for(int i=1;i<list2.size();i++) {
					if(list2.get(i) != null && list2.get(i).length() > list2Max.length()) {
						list2MaxIndex = i;
						list2Max = list2.get(i);
					}
				}
				
				list1.set(list1MaxIndex, list2Max);
				list2.set(list2MaxIndex, list1Max);
			}
		}
	}
}
