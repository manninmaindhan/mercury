package mars1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int first=0,second=1;
for(int i=2;i<=10;i++)
{
int third=first+second;
first=second;
second=third;
System.out.println(third);
}

}

}
