package basicprograms;

public class GreatestCommonDivisor {
static int print(int n1,int n2,int i,int gcd) {
	if(n1%i==0&&n2%i==0) {
		gcd=i;
		System.out.println(gcd);
		return 0;
	}
		i++;
		return print(n1,n2,i,gcd);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using for loop
		/*int n1=45;int n2=48;
int gcd=0;
for(int i=1;i<=n1&&i<=n2;i++) {
	if(n1%i==0&&n2%i==0) {
		gcd=i;
	}
}
System.out.println(gcd);*/
//using while loop
	/*int n1=55,n2=121,gcd=0,i=2;
	while(i<=n1&&i<=n2) {
		if(n1%i==0&&n2%i==0) {
			gcd=i;
			System.out.println(gcd);
			break;
		}
		i++;
	}*/
		
//using do while loop
		/*int n1=55,n2=121,i=2,gcd=0;
		do {
			if(n1%i==0&&n2%i==0) {
				gcd=i;
				System.out.println(gcd);
				break;
				}
			i++;
			}while(i<=n1&&i<=n2);*/
//using recursion method
		int n1=55,n2=121,i=2,gcd=0;
		GreatestCommonDivisor.print(n1,n2,i,gcd);
	
	}
	}


