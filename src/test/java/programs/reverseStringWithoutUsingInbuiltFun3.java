package programs;

import java.util.Scanner;

public class reverseStringWithoutUsingInbuiltFun3 {

	/*
	 * 
	 * using split
	 *
	 */

	public static void main(String[] args) {

		System.out.println("Enter the string ");
		// take input
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();// 5
		int y = in.nextInt();// 10

		System.out.println("beforeSwap -> " + x + " " + y);
		x = x + y;// 15
		y = x - y;// 5
		x = x - y;// 5
		System.out.println("afterSwap -> " + x + " " + y);

	}

}
