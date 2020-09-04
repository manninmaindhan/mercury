package basicprograms;

public class PerfectNumber {
static int print(int no,int sum,int i) {
	if(i==no) {
		return sum;
	}
	 if(no%i==0) {
		sum=sum+i;
	}
	i++;
	return print(no,sum,i);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//using for loop
		int no=6;
int sum=0;
/*for(int i=1;i<no;i++) {
	if(no%i==0) {
		sum=sum+i;
	}
}*/
/*int i=1;
		while(i<no) {
			if(no%i==0) {
				sum=sum+i;
			}
			i++;
		}*/
/*int i=1;
do {
	if(no%i==0) {
		sum=sum+i;
	}
	i++;
	
	}while(i<no);

	*/
//using recursion method
int i=1;
int result=PerfectNumber.print(no,sum,i);

if(no==result) {
	System.out.println("PERFECT NUMBER");
}
else {
	System.out.println("NOT A PERFECT NUMBER");
}
	}

}
