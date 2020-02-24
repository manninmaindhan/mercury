package mars1;

public class FibonacciSerieswithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0,second=1;
		for(int i=2;i<=10;i++)
		{
		first=second;
		second=first+second;
		System.out.println(second);
		}
	}

}
