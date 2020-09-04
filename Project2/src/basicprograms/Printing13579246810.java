package basicprograms;

public class Printing13579246810 {
static int print(int no) {
	if(no==11)
		
		return no=1;
	if(no%2!=0)
		System.out.print(no);
	no++;
	return print(no);
}
static int  print1(int result) {
	if(result==11)
		return 1;
	if(result%2==0)
		System.out.print(result);
	result++;
	return print1(result);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 1;
		//using for loop
		/*
		 * for( no=1;no<=10;no++) { if(no%2!=0) System.out.print(no); }
		 * 
		 * int j=no-(no-1); for(j=1;j<=(no-1);j++) { if(j%2==0) System.out.print(j);
		 * while(no<11) { if(no%2!=0) System.out.print(no); no++; }
		 * 
		 * no=no-(no-1); while(no<11) { if(no%2==0) System.out.print(no); no++;
		 * 
		 * }
		 */
		//using do while method
		/*do {

			if (no % 2 != 0)
				System.out.print(no);
			no++;

		} while (no < 11);
		no = no - (no - 1);
		do {

			if (no % 2 == 0)
				System.out.print(no);
			no++;
		} while (no < 11);*/
		//using while loop
		
		/*while(no<11) {
			if(no%2!=0)
				System.out.print(no);
			no++;
		}
		no=no-(no-1);
		while(no<11) {
			if(no%2==0)
				System.out.print(no);
		no++;
		}*/
		//using recursion method
		int result=Printing13579246810.print(no);
int result2=Printing13579246810.print1(result);
	}
}
