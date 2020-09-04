package basicprograms;

public class FibonacciSeriesUsingTwoVariables {
static int print(int n1,int n2,int i,int count) {
	if(i==10)
		return 0;
	System.out.print(n1+n2+" ");
	n2=n1+n2;
	n1=n2-n1;
	i++;
	return print(n1,n2,i,count);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using for loop
	/*	int n1=0,n2=1,i=2,count=10;
System.out.print(n1+" "+n2+" ");
	for(i=2;i<count;i++) {
		
		System.out.print(n1+n2+" ");
		n2=n1+n2;
		n1=n2-n1;
	}*/
//using while loop
/*		int n1=0,n2=1,i=2,count=10;
	System.out.print(n1+" "+n2+" ");
		while(i<10){
		System.out.print(n1+n2+" ");
	n2=n1+n2;
	n1=n2-n1;
	i++;*/
//using do while loop
		/*int n1=0,n2=1,i=2,count=10;
		System.out.print(n1+" "+n2+" ");
		do {
			System.out.print(n1+n2+" ");
	n2=n1+n2;
	n1=n2-n1;
	i++;
		}while(i<10);*/
//using recursion method
		int n1=0,n2=1,i=2,count=10;
		System.out.print(n1+" "+n2+" ");
	FibonacciSeriesUsingTwoVariables.print(n1,n2,i,count);
	}

}
