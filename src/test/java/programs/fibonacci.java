package programs;

public class fibonacci {

	public static void main(String[] args) {
		// 0,1,1,2,3,5
		int n1 = 0;
		int n2 = 1;
		int x = 6;

		if (x == 1) {
			System.out.println(n1);
		} else if (x == 2) {
			System.out.println(n1 + " " + n2);

		} else {
			int i=0;
			int temp;
			System.out.println(n1);
			System.out.println(n2);
			while(i!=(x-2))
			{
				
				temp=n1+n2;
				System.out.println(temp);
				n1=n2;
				n2=temp;
				
				i++;
				
			}
		}
	}

}
