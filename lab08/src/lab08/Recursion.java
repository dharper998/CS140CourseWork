package lab08;

import java.util.ArrayList;

public class Recursion {
	private static final double DELTA = 1e-6;
	
	public static int factorial(int n) {
		if(n == 0 || n == 1) {
			return 1;
		} else {
			return n * factorial(n-1);
		}
	}
	
	public static double squareRoot(double n) {
		return squareRootHelper(n, 2);
	}
	
	private static double squareRootHelper(double n, double approx) {
		if(n == 0.0) {
			return 0.0;
		} else if(Math.abs((approx*approx)-n) < 1e-6) {
			return approx;
		} else {
			return squareRootHelper(n, (approx + n/approx) / 2);
		}
	}
	
	public static int sum(ArrayList<Integer> nums) {
		return sumHelper(nums, 0);
	}
	
	private static int sumHelper(ArrayList<Integer> nums, int index) {
		if(nums.size() == 0 || index == nums.size()) {
			return 0;
		} else {
			return nums.get(index) + sumHelper(nums, index+1);
		}
	}
	
	public static int sum(int[] nums) {
		return sumHelper(nums, 0);
	}
	
	private static int sumHelper(int[] nums, int index) {
		if(nums.length == 0 || index == nums.length) {
			return 0;
		} else {
			return nums[index] + sumHelper(nums, index+1);
		}
	}
	
	public static int binomialCoefficient(int n, int k) {
		if(k==0) {
			return 1;
		} else if(k > n/2) {
			return binomialCoefficient(n, n-k);
		} else {
			return binomialCoefficient(n-1, k-1) + binomialCoefficient(n-1, k);
		}
	}
}
