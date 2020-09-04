package basicprograms;

public class AdditionFirstNNumbers {
static int print(int i,int sum) {
	int no=5;

	if(i>no)
		return sum;
	sum=sum+i;
	i++;
	return print(i,sum);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using for loop
		/*int n=5;
		int sum=0;
		for(int i=1;i<=n;i++) {
	    sum=sum+i;
		}
		System.out.println(sum);*/
//using while loop
/*	int n=5;
	int i=1;
	int sum=0;
	while(i<=n) {
		sum=sum+i;
		i++;
	}
	System.out.println(sum);
	*/
//using do while loop
		/*int no=5;
		int i=1;
		int sum=0;
		do {
			sum=sum+i;
			i++;	
		}
		while(i<=no);
		System.out.println(sum);*/
//using recursion method
		int sum=0;
		int i=1;
		
int  l=AdditionFirstNNumbers.print(i,sum);
	System.out.print(l);
	//System.out.println(k);
	}

}
