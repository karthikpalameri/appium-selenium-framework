package programs;

public class ArmStrongNumber {
	/*
	 * 
	 * 153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
	 * 
	 */

	public static void main(String[] args) {
		int num = 153;
		System.out.println(isArmStrong(num));
	}

	public static boolean isArmStrong(int num) {
	    int numCopy=num;
		int lastNum;
		int leavingLastNum;
		int res = 0;
		while (num > 0) {
			lastNum = num % 10;
			num = num / 10;
			res = res + (lastNum * lastNum * lastNum);

		}

		if (res == numCopy) {
			System.out.println(numCopy);
			return true;
		} else
			return false;

	}

}
