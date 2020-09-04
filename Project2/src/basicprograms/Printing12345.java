package basicprograms;

public class Printing12345 {
	static int print(int no) {
		if(no==6) {
			return 0;
		}
		else
			System.out.print(no);
no++;
return print(no);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=1;
Printing12345.print(no);
/*for(int i=0;i<5;i++) {
	System.out.print(no+"");
	no++;
}*/

/*while(no<6) {
	System.out.print(no);
	no++;

}*/
/*do {
	System.out.print(no);
	no++;
}
while(no<6);*/
	}

}
