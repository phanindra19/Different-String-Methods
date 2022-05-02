package Different_stringmethods;

public class PrimeNumbers {

	public static void main(String[] args) {

		//Find the prime numbers
		
		int a = 10;

		for (int i = 2; i <= a; i++) {

			int count = 0;

			for (int j = 2; j < i; j++) {

				if (i % j == 0)
					count++;
			}
			if (count == 0)
				System.out.println(i + " ");
		}

		// Given number prime or not

		int num = 5;
		int count = 0;

		if (num > 1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0)
					count++;
			}
			if (count == 2)
				System.out.println("prime number");
			else {
				System.out.println("not prime num");
			}
		} else {
			System.out.println("not prime num");
		}
	}
}
