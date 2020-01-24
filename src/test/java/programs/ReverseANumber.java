package programs;

public class ReverseANumber {

	public static void main(String[] args) {
		rev(256);
	}

	private static void rev(int num) {
		System.out.println(num);
		int  lastnumber;
		int revRes=0;
		while(num>0)
		{
			lastnumber=num%10;
			revRes=revRes*10+lastnumber;
			num = num/10;
		}
		
		System.out.println(revRes);
		
		
	}

}
