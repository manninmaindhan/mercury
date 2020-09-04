package basicprograms;

public class Printing111121 {
static int print (int no) {
	if(no>121)
		return 0;
		System.out.print(no+" ");
	no=no*11;
	return print (no);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=1;
//using while loop
/*while(no<=121) {
	System.out.print(no+" ");
no=no*11;
}*/

//using for loop
/*for( no=1;no<=121;no=no*11) {
	System.out.print(no+" ");
}*/
//using do while loop
/*do {
	System.out.print(no+" ");
no=no*11;
}while(no<=121);
*/
//using recursion method
	Printing111121.print(no);
	}

}
