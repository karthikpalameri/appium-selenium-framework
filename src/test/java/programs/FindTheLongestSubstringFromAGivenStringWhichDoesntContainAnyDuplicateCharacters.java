package programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindTheLongestSubstringFromAGivenStringWhichDoesntContainAnyDuplicateCharacters {

	public static void main(String[] args) {
		String str = "Hello world this is a test string";

		findIt(str);
	}

	private static void findIt(String str) {

		String[] arr = new String[str.length()];

		arr = str.split(" ");

		List<String> l1 = Arrays.asList(arr);
		List<String> l2 = new ArrayList<String>();

		String max = "";
		int count = 0;
		for (String x : l1) {
			if (!checkIfItContainsDuplicateCharacters(x)) {
				if (x.length() > count) {
					max = x;
				}
				l2.add(x);
			}
		}
		System.out.println("These are the words without the repeated characters->" + l2);
		System.out.println("The max non repeated word is ->" + max);

	}

	private static boolean checkIfItContainsDuplicateCharacters(String x) {

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		boolean flag = false;
		char[] ch = x.toCharArray();

		for (char c : ch) {
			if (hm.containsKey(c)) {
				int value = hm.get(c);
				hm.put(c, ++value);
			} else {
				hm.put(c, 1);
			}
		}

		for (Map.Entry<Character, Integer> mde : hm.entrySet()) {
			System.out.println();
			if (mde.getValue() > 1) {
				System.out.println("x has duplicate values so returning false");
				flag = true;
				break;
			} else {
				flag = false;

			}
		}
		return flag;

	}

}
