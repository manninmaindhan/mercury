package basicprograms;

public class SpyNumber {
static int print(int no,int rem,int sum, int prod) {
	if(no==0) {
		System.out.println("sum "+sum);
		System.out.println("prod "+prod);
		if(sum==prod)
		{
		return 1;
		}
		else
			return -1;
	}
	rem=no%10;
	sum=sum+rem;
	prod=prod+rem;
	no=no/10;
	return print(no,rem,sum,prod);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=1234,sum=0,prod=1;
int rem=0;
//using while loop
/*while(no>0) {
	rem=no%10;
	sum=sum+rem;
	prod=prod+rem;
	no=no/10;
}*/
//using for loop
/*for(no=1234;no>0;no=no/10) {
	rem=no%10;
	sum=sum+rem;
	prod=prod+rem;
}*/
//using do while loop
/*do {
	rem=no%10;
	sum=sum+rem;
	prod=prod+rem;
	no=no/10;
}while(no>0);*/
//using recursion method
int result=SpyNumber.print(no,rem,sum,prod);

	if(result>0) {
		System.out.println("spy number");
		}
	
	else {
		System.out.println("Not a spy number");
	}

}
}