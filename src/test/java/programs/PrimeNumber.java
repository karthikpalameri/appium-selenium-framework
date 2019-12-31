package programs;

class PrimeNumber {
	public static boolean checkPrime(int inputNumber) {
		boolean isPrime = true;
		if (inputNumber < 2) {
			isPrime = false;
			return isPrime;
		} else {
			for (int i = 2; i <= inputNumber / 2; i++) {
				if (inputNumber % i == 0) {
					isPrime = false;
					break;
				}
			}
			return isPrime;
		}

	}

	public static void main(String[] args) {
		System.out.println("***");

		int n = 10;//limit
		int inputNumber = 2;
		int counter = 1;

		while (counter <= n) {
			if (checkPrime(inputNumber)) {
				System.out.println(inputNumber);
				inputNumber++;
				counter++;//counter will only increase if there is a primeNumber is Found 
			} else {
				inputNumber++;
			}
		}

	}
}