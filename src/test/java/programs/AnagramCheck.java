package programs;

import java.util.Arrays;

import org.testng.Assert;

public class AnagramCheck {

	private static boolean anagramOrNot(String str1, String str2) {

		char[] a = str1.toCharArray(), b = str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		int res = Arrays.compare(a, b);
		System.out.println(res);
		if (res != 0)
			return false;
		else
			return true;

	}

	public static void main(String[] args) {
		String str1 = "stop";
		String str2 = "pots";

		System.out.println(anagramOrNot(str1, str2));
	}

}
