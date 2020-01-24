package programs;

public class FindPairWhoseSumIsEqualToGivenNumber {

	public static void main(String[] args) {

		int[] a = {1,3,5,7,9,2,4,6,8};
		int sum= 5;
		
		findPair(a,sum);
	}

	private static void findPair(int[] a, int sum) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == sum)
					System.out.println(a[i] + " " + a[j]);
			}
		}
	}

}
