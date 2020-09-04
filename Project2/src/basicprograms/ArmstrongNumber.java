package basicprograms;

public class ArmstrongNumber {
static int print(int no,int rem,int arm) {
	if(no==0)
	{
		return arm;
	}
	else
	rem=no%10;
	arm=arm+(rem*rem*rem);
	no=no/10;
	return print(no,rem,arm);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no=153,no2=no,rem=0,arm=0;
		//using for loop
		/*for(no=153;no>0;no=no/10) {
			rem=no%10;
			arm=arm+(rem*rem*rem);	
		}*/
		//using while loop
		/*while(no>0) {
			rem=no%10;
			arm=arm+(rem*rem*rem);
			no=no/10;
		}*/
		//using do while loop
		/*do {
			rem=no%10;
			arm=arm+(rem*rem*rem);
			no=no/10;
		}while(no>0);*/
		//using recursion method
		int result=ArmstrongNumber.print(no,rem,arm);
		
		if(no2==result)
		System.out.println("armstrong number");
		else
		System.out.println("Not a armstrong number");
	}

}
