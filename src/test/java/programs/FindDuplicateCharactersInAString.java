package programs;

public class FindDuplicateCharactersInAString {

	public static void main(String[] args) {

		String str = "tesstt";
		// 012345
		char[] arr = str.toCharArray();
		int counter = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i+1; j < str.length(); j++) {
				if (arr[i] == arr[j]) {
					System.out.println(arr[j] + "->" + (++counter));
					break;
				}
			}
		}
	}
}
