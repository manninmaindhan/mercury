package basicprograms;

public class Printing149162536496481100 {
static int print (int no) {
	if(no==11)
		return 0;
	System.out.print((int)Math.pow(no, 2)+" ");
	no++;
	return print(no);
		
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=1;
		//using while loop
		/*while(no<=10) {
			System.out.print((int)Math.pow(no, 2)+" ");
		no++;
		}*/
	//using for loop
/*for(no=1;no<=10;no++) {
	System.out.print((int)Math.pow(no, 2)+" ");
}*/
//using do while loop
/*do {
	System.out.print((int)Math.pow(no, 2)+" ");
	no++;
}while(no<=10);*/
//using recursion method
Printing149162536496481100.print(no);
	}

}
