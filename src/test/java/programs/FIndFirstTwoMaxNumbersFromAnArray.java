package programs;

public class FIndFirstTwoMaxNumbersFromAnArray {

	public static void main(String[] args) {

		int[] a = { 2, 3, 5, 6, 7, 8, 47, 1 };

		findFirstTwoMaxNum(a);

	}

	private static void findFirstTwoMaxNum(int[] a) {
		
		int firstMax=0;
		int secondMax=0;
		
		for(int m : a)
		{
			if(firstMax<m)
			{
				secondMax=firstMax;
				firstMax=m;
			}
			else if(secondMax < m)
			{
				secondMax = m;
			}
		}
		
		
		System.out.println(firstMax+"\n"+secondMax);
		
	}

}
