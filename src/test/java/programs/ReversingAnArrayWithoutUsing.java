package programs;

import java.util.Arrays;

public class ReversingAnArrayWithoutUsing {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
		rev(a);
	}

	private static void rev(int[] a) {
		System.out.println("Before->"+Arrays.toString(a));

		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}

		System.out.println("After->"+Arrays.toString(a));

	}

}
