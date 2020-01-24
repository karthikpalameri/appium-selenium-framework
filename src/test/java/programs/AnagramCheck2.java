package programs;

import java.util.Arrays;

import org.testng.Assert;

public class AnagramCheck2 {

	private static boolean anagramOrNot(String str1, String str2) {

		char[] ch = str1.toCharArray();
		StringBuffer sb = new StringBuffer(str2);
		for (char x : ch) {
			int index = sb.indexOf("" + x);
			if (index != -1)
				sb.deleteCharAt(index);
			else
				return false;

		}
		return sb.length() == 0 ? true : false;

	}

	public static void main(String[] args) {
		String str1 = "stop";
		String str2 = "pots";

		System.out.println(anagramOrNot(str1, str2));
	}

}
