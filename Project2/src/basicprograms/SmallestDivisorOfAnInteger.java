package basicprograms;

public class SmallestDivisorOfAnInteger {
static int print(int no,int i) {
	
	if(no%i==0)
		return i;
	i++;
	return print(no,i);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using for loop
		/*int no=39;
for(int i=2;i<=no;i++)
{
	if(no%i==0) {
		System.out.println(i);
		break;
}
}*/
//using while loop
/*		int no=69;
		int i=2;
		while(i<=no) {
			if(no%i==0) { 
				System.out.println(i);
				break;
			}
			i++;
			}*/
//using do while loop
/*		int no=69;
		int i=2;
		do {
			if(no%i==0) {
				System.out.println(i);
				break;
			}
			i++;
			}while(i<=no);*/
//using recursion method
		int no=69;
		int i=2;
		int result=SmallestDivisorOfAnInteger.print(no,i);
		System.out.println(result);
		}
		}

	


