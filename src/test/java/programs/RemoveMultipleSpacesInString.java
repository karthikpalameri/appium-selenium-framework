package programs;

public class RemoveMultipleSpacesInString {

	public static void main(String[] args) {
		String str = "This is    a      test   string";
		System.out.println(str.replaceAll("\\s+"," "));
	}

}
