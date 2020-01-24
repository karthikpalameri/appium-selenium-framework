package programs;

public class FactorialOfANumber {

	public static void main(String[] args) {
		System.out.println(fact(5));
		System.out.println(recusriveFact(5));
	}

	public static int recusriveFact(int m) {

		if (m == 0)
			return 1;

		return m * recusriveFact(m - 1);

	}

	public static int fact(int n) {
		int res = 1;
		for (int j = n; j >= 1; j--) {
			res = res * j;

		}
		return res;
	}
}
