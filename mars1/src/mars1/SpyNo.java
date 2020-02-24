package mars1;

public class SpyNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no=1234,sum=0,prod=1;
	
			while(no>0)
			{
				int rem=no%10;
				sum=sum+rem;
				prod=prod*rem;
				no=no/10;	
			}

		System.out.println("SUM "+sum);
		System.out.println("PROD "+prod);
		if(sum==prod) {
			System.out.println("spy number");
			}
		else {
System.out.println("not spy number");
	}

}
}