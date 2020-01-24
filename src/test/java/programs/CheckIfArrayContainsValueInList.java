package programs;

import java.util.Arrays;
import java.util.List;

public class CheckIfArrayContainsValueInList {

	public static void main(String[] args) {

		Integer a[] = { 1, 2, 3, 4, 5 };
		int toFind = 1;

		System.out.println(checkIfPresent(a, toFind));
	}

	private static boolean checkIfPresent(Integer[] a, int toFind) {
		return Arrays.asList(a).contains( toFind);

	}

}
