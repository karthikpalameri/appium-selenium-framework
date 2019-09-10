package programs;

public class converToAscii {
	public static void main(String[] args) {

		char charvar = 'A';
		int asciivalue = charvar;
		System.out.println(charvar);
		System.out.println(asciivalue);
		System.out.println("**");

		for (char ch = 'A'; ch < 'z'; ch++) {
			System.out.print(ch + "_" + (int) ch + " ");
		}
		System.out.println("**");
		char x=1;
		System.out.println(x);

	}

}
