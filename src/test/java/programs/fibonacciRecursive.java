package programs;

import java.util.Scanner;

public class fibonacciRecursive {

	public static void main(String[] args) {

		System.out.print("Enter how many you want");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		for (int i = 0; i < x; i++) {
			System.out.println(fibonacciRecurive(i));
		}
	}

	/*
	 * 0,1,1,2,3
	 */
	private static int fibonacciRecurive(int n) {
		if (n == 0) {
			return 0;
		}
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacciRecurive(n - 2) + fibonacciRecurive(n - 1);
	}

}
