
public class PrimeNumbers {
	public static void main(String[] args) {
		// Empty String
		String primeNumbers = "";

		for (int i = 1; i <= 1000; i++) {
			int count = 0;
			for (int j = i - 1; j >= 2; j--) {
				if (i % j == 0) {
					count = count + 1;
				}
			}
			if (count == 0) {
				// Appended the Prime number to the String
				primeNumbers = primeNumbers + i + " ";
			}
		}
		System.out.println("Prime numbers from 1 to 100 are :");
		System.out.println(primeNumbers);
	}
}
