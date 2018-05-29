package lab05;

public class Zipper {
	public static int[] zip(int[] arr1, int[] arr2) {
		if(arr1 == null || arr2 == null || arr1.length != arr2.length) {
			throw new IllegalArgumentException("Bad Input");
		} else {
			int[] newArr = new int[arr1.length*2];
			if(arr1.length == 0) {
				return newArr;
			} else {
				int arr1Index = 0;
				int arr2Index = 0;
				for(int i=0;i<newArr.length;i++) {
					if(i%2 == 0){
						newArr[i] = arr1[arr1Index];
						arr1Index += 1;
					} else {
						newArr[i] = arr2[arr2Index];
						arr2Index += 1;
					}
				}
				return newArr;
			}
		}
	}
}
