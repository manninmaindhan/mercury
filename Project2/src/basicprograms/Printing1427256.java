package basicprograms;

public class Printing1427256 {
static int print(int no) {
	if(no==5)
		return 0;
	System.out.print((int)Math.pow(no, no)+" ");
	no++;
	return print(no);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=1;
//using while loop
/*while(no<=4) {
	System.out.print((int)Math.pow(no, no)+" ");
	no++;
}*/
//using for loop
/*for(no=1;no<=4;no++) {
	System.out.print((int)Math.pow(no, no)+" ");
}*/
//using do while loop
/*do {
	System.out.print((int)Math.pow(no, no)+" ");
no++;
}
while(no<=4);*/
//using recursion method
Printing1427256.print(no);
	}

}
