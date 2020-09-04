package basicprograms;

public class PrintingFactorials {
static int print( int j, int m) {
	if(j==1)
		return m;
	m=m*j;
	j--;
	return print( j, m);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using for loop
		
	/*for(int i=5;i>=1;i--) {
		int m=1;
		for(int j=i;j>=1;j--) {
			m=m*j;
		}
		System.out.print(m+" ");
	}*/
//using while loop
/*		
		int i=5;
		while(i>=1) {
			int m=1;
			int j=i;
			while(j>=1) {
				m=m*j;
				j--;
			}
			System.out.print(m+" ");
			i--;
		}*/
//using do while loop
	
/*		int i=5;
		do{
			int j=i;
			int m=1;
		do {
			m=m*j;
			j--;
			
		}while(j>=1);
		System.out.print(m+" ");
		i--;
	}while(i>=1);*/
//using recursion method
		int i=5;
		
		int m=1;
		while(i>=1) {
			int j=i;
		int k=PrintingFactorials.print(j,m);
		System.out.print(k+" ");
		i--;
		}
}
	}