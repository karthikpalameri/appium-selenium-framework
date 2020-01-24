package programs;

public class primeNumberPrint {

	public static boolean checkPrime(int inputNumber) {
		boolean isPrime = true;
		if (inputNumber < 2) {
			isPrime = false;
			return isPrime;
		} else {
			for (int i = 2; i < inputNumber ; i++) {
				if (inputNumber % i == 0) {
					isPrime = false;
					break;
				}
			}
			return isPrime;
		}

	}

	public static void main(String[] args) {
		
		for (int j = 0; j < 10; j++) {
			System.out.println(j + "->" + checkPrime(j));
		}
	}
}
