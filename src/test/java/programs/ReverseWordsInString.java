package programs;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String str = "This is test string";
		revWord(str);

	}

	private static void revWord(String str) {
		StringBuffer sb = new StringBuffer();
		String[] words = str.split("\\s");

		for (int i = 0; i < words.length; i++) {
			sb.append(rev(words[i])+" ");
		}
		
		System.out.println(sb.toString());
	}

	private static String rev(String string) {
		char[] a = string.toCharArray();
		for (int i = 0; i < a.length / 2; i++) {
			char temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		String revWord = new String(a);
		System.out.println(revWord);
		return revWord;
	}

}
