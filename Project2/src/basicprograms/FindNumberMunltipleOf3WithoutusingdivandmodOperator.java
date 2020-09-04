package basicprograms;

public class FindNumberMunltipleOf3WithoutusingdivandmodOperator {
static int print (int i,int no) {
	if(no==i)
	{
		
		return -1;
	}
	else if(no>i)
	{
		return 1;
	}
	i=i+3;
	return print(i,no);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=38;
//using for loop
/*for(int i=3;i<=no;i++) {
	if(no==i) {
		System.out.println(no+ " number is multiple of 3");
	}
	i=i+3;
}*/
//using while loop
/*int i=3;
while(i<=no) {
	if(no==i) {
		System.out.println(no+" number is multiple of 3");
	}
	i=i+3;
}*/
//using do while loop
/*int i=3;
do {
if(no==i) {
	System.out.println(no+" number is multiple of 3");
}
i=i+3;
}while(i<=no);*/
//using recursion method
int i=3;

int result=FindNumberMunltipleOf3WithoutusingdivandmodOperator.print(i,no);
if(result==-1) {
	System.out.println(no+" number is  multiple of 3 ");
}
System.out.println(no+" number is not multiple of 3");

	}

}
