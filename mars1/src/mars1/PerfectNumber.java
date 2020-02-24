package mars1;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sum=0;
int no=6;
for(int i=1;i<no;i++)
{
	if (no%i==0) {
		sum=sum+i;
		
	}
}
if(sum==no) {
	System.out.println("PERFECT NUMBER");
	}
else {
	System.out.println("NOT PERFECT NUMBER");
}
	}
}
