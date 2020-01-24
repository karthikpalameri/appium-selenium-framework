package programs;

public class FindSecondHighestNumberInArray {

	public static void main(String[] args) {
		int[] arr = { 3, 5, 7, 2, 5, 8, 6, 1 };

		System.out.println(findSecondHighest(arr));

	}

	public static int findSecondHighest(int[] arr) {
		int firstLargest = 0;
		int secondLargest = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if (arr[i] > secondLargest) {
				secondLargest = arr[i];
			}
		}
		return secondLargest;
	}

}
