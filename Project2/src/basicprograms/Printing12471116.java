package basicprograms;

public class Printing12471116 {
static int print(int no,int i) {
	if(no==22)
		return 0;
	System.out.print(no+" ");
	no=no+i;
	i++;
	return print(no,i);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=1;
/*int i=1;
		//using while loop
		while(no<=16) {
			System.out.print(no+" ");
			no=no+i;
			i++;
		}*/
		//using for loop
/*int i=0;
		for(no=1;no<=16;no=no+i) {
			System.out.print(no+" ");
		i++;
		}*/
//using do while loop
/*int i=1;
do {
	System.out.print(no+" ");
no=no+i;
i++;
}while(no<=16);*/
//using recursion
int i=1;
Printing12471116.print(no,i);
	}

}
