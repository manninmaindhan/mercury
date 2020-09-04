package basicprograms;

public class BinaryToDecimal {
static int print(int no,int power,int dec,int rem) {
	if(no==0)
		return dec;
		rem=no%10;
	dec=(int)(dec+(rem*Math.pow(2, power)));
	no=no/10;
	power++;
	return print(no,power,dec,rem);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using while loop
		/*int no=1001;
int i=no;
int power=0,dec=0,rem=0;
while(no>0) {
	rem=no%10;
	dec=(int)(dec+(rem*Math.pow(2, power)));
	no=no/10;
	power++;
}
System.out.println(i+" Binary to decimal is "+dec);*/
//using do while loop
/*	int no=1001;
	int i=no;
	int power=0,dec=0,rem=0;
	do {
		rem=no%10;
		dec=(int)(dec+(rem*Math.pow(2, power)));
		no=no/10;
		power++;
	}while(no>0);
	System.out.println(i+" Binary to Decimal is "+dec);
	*/
//using for loop
	/*	int no=1001;
		int i=no;
		int power=0,dec=0,rem=0;
		for(no=1001;no>0;no=no/10) {
			rem=no%10;
			dec=(int)(dec+(rem*Math.pow(2, power)));
			power++;
		}
	System.out.println(i+" Binary to decimal is "+dec);*/
//using recursion method
		int no=1001;
		int i=no;
		int power=0,dec=0,rem=0;
		int result=BinaryToDecimal.print(no,power,dec,rem);
System.out.println(i+" Binary to Decimal is "+result);
	
	}

}
