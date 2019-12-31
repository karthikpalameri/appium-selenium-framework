package programs;

public class Palindrome {

	public static void main(String[] args) {
		try {
			String inputStr = "Hello";
			String revStr = "";
			for (int i = inputStr.length() - 1; i >= 0; i--) {
				revStr = revStr + inputStr.charAt(i);
			}
			System.out.println("Original String ->" + inputStr + "\nReversed String ->" + revStr);
			if (revStr.equals(inputStr))
				System.out.println("String palindrome");
			else
				System.out.println("String Not palindrome");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
