package basicprograms;

import java.util.Scanner;

public class SquareRootDemo {
//Returns  floor of square root  of x 
//	static int floorSqrt(int x)
//	{
//		//Base case
//		if(x==0||x==1)
//		{
//			return x;
//		}
//		//starting from 1, try all numbers until i*i is greater than or equal to x
//		int i=1,result=1;
//		while(result<=x) {
//			i++;
//			result =i*i;
//		}
//		return i-1;
//	}
//	//Driver program
//	public static void main(String[] args) {
//	int x=11;
//	System.out.println(floorSqrt(x));
	
	public static void main(String[] args) {
		double number,squareRoot;
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter any number: ");
		number=sc.nextInt();
		squareRoot=Math.pow(number, 0.5);
		System.out.println("The square of a given number "+" ="+squareRoot);

	}

}
