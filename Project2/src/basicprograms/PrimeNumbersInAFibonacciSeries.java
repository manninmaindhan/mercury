package basicprograms;

public class PrimeNumbersInAFibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no1 = 0;
		int no2 = 1;
		int no3 = 0;
		while (no1 < 100) {
			no3 = no1 + no2;
			System.out.println(no3 + " ");
			// check the number is prime or not
			int j = 1;
			int count = 0;
			while (j <= no3) {

				if (no3 < 2) {
					System.out.println("prime number " + no3);
				} else if (j <= no3) {
					if (no3 % j == 0) {
						count++;
					}
				}
				j++;
			}
			if (count == 2) {
				System.out.println("prime number " + no3);
			} else
				System.out.println("not a prime number " + no3);

			no1 = no2;
			no2 = no3;

		}
	}

}
