package programs;

public class reverseStringWithoutUsingInbuiltFun2 {

	/*
	 * 
	 *using toCharArray()
	 *.length gives the exaxt size of array
	 *
	 */
	
	public static void main(String[] args) {
		
		String text= "abcdefg";
		
		char[] a = text.toCharArray();
		
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i]);	
		}
		
		
	}
	
}
