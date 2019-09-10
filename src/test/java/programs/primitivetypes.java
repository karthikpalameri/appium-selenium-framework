package programs;

public class primitivetypes {

	public static void main(String[] args) {
		System.out.println("primitive types");

		/*
		 * byte Size:8-bit Range:-128 to 127
		 */
		byte bytevar = 10;
		System.out.println("bytevar:" + bytevar);

		/*
		 * short Size:16-bit Range:-2^15 to +2^15 -1
		 */
		short shortvar = 23;
		System.out.println("shortvar:" + shortvar);

		/*
		 * int Size:32-bit Range: -2^31 to +2^31 -1
		 */
		int intvar = 34;
		System.out.println("intvar:" + intvar);

		/*
		 * long Size:64-bit Range: -2^63 to +2^63-1
		 */
		long longvar = 34;
		System.out.println("longvar:" + longvar);

		/*
		 * float Size:32-bit Range: 32-bit IEEE 754 floating-point numbers
		 */
		float floatvar = 34.55f;
		System.out.println("floatvar:" + floatvar);

		/*
		 * double Size:64-bit Range: 64-bit IEEE 754 floating-point numbers
		 */
		double doublevar = 34.55;
		System.out.println("doublevar:" + doublevar);

		/*
		 * boolean Size:1-bit Range: true or false
		 */
		boolean booleanvar = true;
		System.out.println("booleanvar:" + booleanvar);

		/*
		 * char Size:16-bit Range:\u0000 to \uFFFF
		 */
		char charvar = 't';
		System.out.println("charvar:" + charvar);

		/*
		 * Type casting
		 * 
		 * Widening ::sequence possible is:: byte->short->int->long->float->double
		 * Narrowing ::reverse sequence
		 *
		 *
		 * we cannot feed int to char
		 */
		
		char ch='c';
		int i=(65+26);
		ch= (char) i;
		System.out.println("->>"+ch);
		

	}

}
