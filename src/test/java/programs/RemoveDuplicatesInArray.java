package programs;

import java.util.Arrays;
import java.util.Iterator;
/*
 * 
 * PENDING 
 * 
 * 
 */
public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 3, 3, 3, 2, 2, 2 };
		removeDuplicate(a);
	}

	private static void removeDuplicate(int[] a) {
		int counter = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					for (int k = i; k < a.length - 1; k++) {
						a[k] = a[k + 1];
					}
					j--;
					counter++;
					System.out.println("Matching " + a[i] + " with " + a[j] + " counter now is ->" + counter);
					System.out.println(Arrays.toString(a));
				}
				// System.out.println("NOT Matching " + a[i] + " with " + a[j] + " counter now
				// is ->" + counter);
			}

		}

		System.out.println(a);

	}

}
