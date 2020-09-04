package basicprograms;

public class Palindrome {

	public static void main(String[] args) {
		
//using for loop
		int no = 111;
		int sum = 0;

		for (int i = no; i > 0; i = i / 10) {
			int rem = i % 10;
			sum = (sum * 10) + rem;
		}
		if (no == sum)
			System.out.println(" it is palindrome");

		else
			System.out.println("it is not a palindrome");
	}

}
