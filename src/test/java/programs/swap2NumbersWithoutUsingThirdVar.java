package programs;

import java.util.Scanner;

public class swap2NumbersWithoutUsingThirdVar {

	/*
	 * 
	 *using split
	 *
	 */

	public static void main(String[] args) {

		System.out.println("Enter the string ");
		// take input
		Scanner in = new Scanner(System.in);
		String text = in.nextLine();

		String[] arr = text.split("");

		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}

	}

}
