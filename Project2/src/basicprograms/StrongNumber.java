package basicprograms;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int no=145;
int no2=no;

int rem=0;

int sum=0;
while(no>0) {
	//digits separation
	rem=no%10;
	
	//factorial part of digit
	int m=1;
	while(rem>0) {
		m=m*rem;
		rem--;
	}
	//sum of factorial of each digits
	
	sum=sum+m;

	no=no/10;

}
if(sum==no2) {
	System.out.println("Strong number");
}
else {
System.out.println("Not a Strong number"); 
	}

}
}