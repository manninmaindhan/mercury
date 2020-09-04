package basicprograms;

public class FibonacciSeries {
static int print(int n1,int n2,int n3,int i,int count) {
	if(i==10)
		return 0;
	n3=n1+n2;
	System.out.print(n3+" ");
n1=n2;
n2=n3;
i++;
     
return print(n1,n2,n3,i,count);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using for loop
	/*
int n1=0,n2=1,n3,i,count=10;
System.out.print(n1+" "+n2+" ");
for(i=2;i<count;i++) {
	n3=n1+n2;
	System.out.print(n3+" ");
	n1=n2;
	n2=n3;
}*/
//using while loop
/*int n1=0,n2=1,n3,i=2,count=10;
System.out.print(n1+" "+n2+" ");
while(i<10) {
n3=n1+n2;
System.out.print(n3+" ");
n1=n2;
n2=n3;
i++;
}*/
//using do while loop
	/*	int n1=0,n2=1,n3,i=2,count=10;
		System.out.print(n1+" "+n2+" ");
		do{
			n3=n1+n2;
			System.out.print(n3+" ");
		n1=n2;
		n2=n3;
		i++;
		}while(i<10);*/
//using recursion method
		int n1=0,n2=1,n3=0,i=2,count=10;
		System.out.print(n1+" "+n2+" ");
FibonacciSeries.print(n1,n2,n3,i,count);
	
	}

}
