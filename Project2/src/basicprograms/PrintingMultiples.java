package basicprograms;

public class PrintingMultiples {
static int print(int i) {
	if(i>5)
		return 0;
	System.out.print((i*(i+1))+" ");
i++;
return print(i);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using for loop
		/*
		 * for(int i=1;i<=5;i++) { System.out.print((i*(i+1))+" "); }
		 */
//using while loop
		/*
		 * int i=1; while(i<=5) { System.out.print((i*(i+1))+" "); i++; }
		 */
//using do while loop
		/*
		 * int i=1; do { System.out.print((i*(i+1))+" "); i++; }while(i<=5);
		 */
// using Recursion
int i=1;
PrintingMultiples.print(i);
	
	
	
	}

}
