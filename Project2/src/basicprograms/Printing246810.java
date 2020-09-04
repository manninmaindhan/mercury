package basicprograms;

public class Printing246810 {
static int print(int no) {
	if(no>10)
		return 0;
	if(no%2==0)
		System.out.print(no);
no++;
return print(no);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=1;
/*for(int i=0;i<10;i++) {
	if(no%2==0)
		System.out.print(no);
	no++;
}*/
/*while(no<=10) {
	if(no%2==0)
		System.out.print(no);
no++;
}*/
/*do {
	if(no%2==0)
		System.out.print(no);
no++;
}
while(no<=10);*/
Printing246810.print(no);
	}

}
