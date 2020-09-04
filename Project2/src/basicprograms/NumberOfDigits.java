package basicprograms;

public class NumberOfDigits {
static int print(int no,int count) {
	if(no==0) {
		return count;
	}
	no=no/10;
	count++;
	return print(no,count);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 12345;
		int rem = 0;
		int count = 0;
	//using for loop
		/*for (int i = no; i > 0; i = i / 10) {
			count++;
		}*/
		//using while loop
		/*while(no>0) {
			no=no/10;
			count++;
		}*/
		//using do while loop
		/*do {
			no=no/10;
			count++;
		}while(no>0);
		*/
		//using recursion method
		int result=NumberOfDigits.print(no,count);
		System.out.println(result);
	}

}
