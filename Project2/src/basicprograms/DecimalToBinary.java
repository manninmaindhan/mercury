package basicprograms;

public class DecimalToBinary {
static String print (int i,String rem) {
	if(i==0)
		return rem;
	rem=i%2+rem;
	i=i/2;
return print(i,rem);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using while loop
	/*	int i=4;
		String rem="";
		while(i>0) {
			rem=i%2 +rem;
			i=i/2;
		}
		System.out.print(rem);*/
//using do while loop
		/*int i=4;
		String rem="";
		do {
			rem=i%2+rem;
			i=i/2;
		}while(i>0);
		System.out.println(rem);*/
//using for loop
		/*int i=4;
	String rem="";
	for(i=4;i>0;i=i/2) {
		rem=i%2+rem;	
	}
	System.out.println(rem);
	}*/
//using recursion method
	int i=4;
	String rem="";
	String result=DecimalToBinary.print(i,rem);
	System.out.println(result);
}
}