package basicprograms;

public class PrintingNoTwist {
static int print(int m,int j,int i) {
	if(i==5)
		return 0;
	m=i*j;
	System.out.print(m+" ");
	i++;
	j--;
	return print(m,j,i);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using for loop
	/*	int m=0;	int j=10;
		for(int i=1;i<5;i++) {
		
			m=i*j;
			System.out.print(m+" ");
			j--;
		}*/
//using while loop
		/*int m=0;
		int j=10;
		int i=1;
		while(i<5) {
			m=i*j;
			System.out.print(m+" ");
			i++;
			j--;
		}*/
//using do while loop
	/*	int m=0;
		int j=10;
		int i=1;
		do {
			m=i*j;
			System.out.print(m+" ");
		i++;
		j--;
		}while(i<5);*/
//using recursion
		int m=0;
		int j=10;
		int i=1;
		PrintingNoTwist.print(m,j,i);
	}

}
