package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindFirstNonRepeatedCharacterInAString {

	public static void main(String[] args) {
		String str = "This is a test string ";
		findFirstNonRepeatedCharacterInAString(str);
	}

	private static void findFirstNonRepeatedCharacterInAString(String str) {
		char[] a = str.toCharArray();

		HashMap<Character, Integer> hm = new HashMap<Character, Integer>(str.length());

		for (char c : a) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			} else {
				hm.put(c, 1);
			}
		}

		for (Entry<Character, Integer> x : hm.entrySet()) {

			if (x.getValue() == 1) {
				System.out.println(x.getKey() + "" + x.getValue());
			}
		}

	}

}
