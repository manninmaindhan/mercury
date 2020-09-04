package basicprograms;

public class NeonNumber {
static int print(int no2,int neon,int rem) {
	if(no2==0) {
		return neon;
	}
	rem=no2%10;
	neon=neon+rem;
	no2=no2/10;
	return print(no2,neon,rem);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=9,rem=0,neon=0;
//using while loop
/*while(no2>0) {
	rem=no2%10;
	neon=neon+rem;
	no2=no2/10;
}*/
//using for loop
/*for(int no2=no*no;no2>0;no2=no2/10) {
	rem=no2%10;
	neon=neon+rem;
}*/
//using do while loop
/*int no2=no*no;
do {
	rem=no2%10;
	neon=neon+rem;
	no2=no2/10;
}while(no2>0);*/
//using recursion method
int no2=no*no;
int result=NeonNumber.print(no2,neon,rem);
if(result==no) {
	System.out.println("Neon number");
}
else {
	System.out.println("Not  Neon number");
}

	}

}
