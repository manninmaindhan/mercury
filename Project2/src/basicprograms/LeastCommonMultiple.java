package basicprograms;

public class LeastCommonMultiple {
static int print (int big,int small,int bigcount) {
	if(big%small==0) {
		System.out.println("lcm is : "+big);
	return 0;
	}
	big=big+bigcount;
	return print(big, small, bigcount);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using while loop
		/*int n1=5,n2=4;
int small=n1<n2?n1:n2;
int big=n1>n2?n1:n2;
int bigcount=big;
while(true) {
	if(big%small==0) {
		System.out.println("lcm is: "+ big);
break;
}
big=bigcount+big;
}*/
//using for loop
/*int n1=5,n2=4;
int small=n1<n2?n1:n2;
int big=n1>n2?n1:n2;

for(int b=big;true;big=b+big) {
	if(big%small==0) {
		System.out.println("lcm is : "+big);
	break;
	}
		
}*/
//using do while loop
/*int n1=5,n2=4;
int small=n1<n2?n1:n2;
int big=n1>n2?n1:n2;
int bigcount= big;

do {
if(big%small==0) {
	System.out.println("lcm is "+big);
	break;
}
	big=big+bigcount;
}while(true);*/
//using recursion method
	int n1=5,n2=4;
	int small=n1<n2?n1:n2;
	int big=n1>n2?n1:n2;
	int bigcount=big;
	LeastCommonMultiple.print(big,small,bigcount);
}
	}


