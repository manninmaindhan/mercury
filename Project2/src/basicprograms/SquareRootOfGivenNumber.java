package basicprograms;

public class SquareRootOfGivenNumber {
static int print(int i) {
	if(i==5)
		return 0;
	System.out.print((int)Math.pow(i, 2)+" ");
i++;

return print(i);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using for loop
/*		for(int i=1;i<5;i++) {
			System.out.print((int)Math.pow(i, 2)+" ");
		}*/
//using while loop
	/*	int i=1;
		while(i<5) {
			System.out.print((int)Math.pow(i, 2)+" ");
			i++;
		
		}*/
//using do while loop
	/*	int i=1;
		do {
			System.out.print((int)Math.pow(i, 2)+" ");
			i++;
		}while(i<5);*/
//using recursion method
		int i=1;
		SquareRootOfGivenNumber.print(i);
	}

}
