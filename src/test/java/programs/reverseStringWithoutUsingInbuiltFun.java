package programs;

public class reverseStringWithoutUsingInbuiltFun {

	/*
	 * 
	 *StringBuilder mutable
	 *Not thread safe , so not synchronized 
	 *Fast then StingBuffer
	 *
	 *StringBuilder() initial capacity is 16
	 *
	 */
	
	public static void main(String[] args) {
		
		String text= "abcdefg";
		StringBuilder sb = new StringBuilder();
		sb.append(text);
		System.out.println("rev->"+sb.reverse());
	}
	
}
