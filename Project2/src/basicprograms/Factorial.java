package basicprograms;
//wrong perspective and it's a wrong program
public class Factorial {
	//To find  a factorial 
	static int factorial(int n)
	{
		if(n==0)
			return 1;
		return n*factorial(n-1);
	}
	//Driver method
	public static void main(String[] args) {
		int num=5;
		System.out.println("factorial of "+num+" is "+factorial(num));
	}


}
