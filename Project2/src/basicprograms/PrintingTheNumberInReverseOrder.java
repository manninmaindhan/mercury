package basicprograms;

public class PrintingTheNumberInReverseOrder {
static int print(int i) {
	if(i==0)
		return 0;
      int 	rem=i%10;
System.out.print(rem+"");
i=i/10;
return print(i);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using for loop
		/*int no=1234;
for(int i=no;i>0;i=i/10) {
	int rem=i%10;
	System.out.print(rem+"");
}*/
//using while loop
/*		int no=1234;
		int i=no;
		while(i>0) {
			int rem=i%10;
			System.out.print(rem+"");
		i=i/10;
		}*/
//using do while loop
	/*	int no=1234;
		int i=no;
		do {
			int rem=i%10;
			System.out.print(rem+"");
			i=i/10;
			
		}while(i>0);*/
//using recursion method
		int no=1234;
		int i=no;
		PrintingTheNumberInReverseOrder.print(i);
	}

}
