package programs;

import java.util.Arrays;

public class FindSmallestAndLargestNumber {

	public static void main(String[] args) {
		int[] a = { 1, 5, 3, 6, 7, 9 };

		findSmallAndLarge(a);

	}

	private static void findSmallAndLarge(int[] a) {

		int small = a[1];
		int large = a[1];

		for (int num : a) {
			if (num > large) {
				large = num;
			} else if (num < small) {
				small = num;
			}
		}

		System.out.println(Arrays.toString(a));
		System.out.println("small ->" + small + "\nlarge->" + large);

	}

}
