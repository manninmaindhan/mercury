package mars1;

public class FibonacciProblems {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0,second=1,count=0,third=1;
		while(true)
		{
		first=second;
		second=third;
		third=first+second;
		count++;
		if(third==233) {
		System.out.println("I got");
		break;
		}
		else if(third>223){
			System.out.println("not get");
		}
			
		}

	}

}
