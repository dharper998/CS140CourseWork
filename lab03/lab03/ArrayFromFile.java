package lab03;
import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayFromFile {
	private int[] array;

	public ArrayFromFile(String filename) {
		try (Scanner sc = new Scanner(new File(filename))) {
			int length = sc.nextInt();
			array = new int[length];
			for (int i = 0; i < length; i++) {
				array[i] = sc.nextInt();
			}
		} catch (Exception e) {
			array = new int[0];
		}
	}

	public int[] getArray() {
		return array;
	}

	public String toString() {
		return Arrays.toString(array);
	}

	public void removeOddElements() {
		int evenLength = 0;
		for(int i : array) {
			if(i%2 == 0) {
				evenLength += 1;
			}
		}
		int[] tempArray = new int[evenLength];
		int index = 0;
		for(int i : array) {
			if(i%2 == 0) {
				tempArray[index] = i;
				index += 1;
			}
		}
		array = tempArray;
	}
}
