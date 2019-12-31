package programs;

public class FibonacciSeries {

	public static void printFib(int limit) {
		int n1 = 0;
		int n2 = 1;
		int temp;
		if (limit == 1) {
			System.out.println(n1);
		} else if (limit == 1) {
			System.out.println(n1 + " " + n2);
		} else {
			System.out.println(n1);
			System.out.println(n2);
			for (int i = 2; i < limit ; i++) {
				temp = n1;
				n1 = n2;
				n2 = temp + n1;
				System.out.println(" " + n2);
			}

		}

	}

	public static void main(String[] args) {
		// 0,1,2,3,5,8
		printFib(6);
	}
}
